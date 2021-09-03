package sandbox;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.google.common.collect.ImmutableSet;
import com.google.common.reflect.ClassPath;
import com.google.common.reflect.ClassPath.ClassInfo;
import libact4e.FiniteSet;
import libact4e.FiniteSetRepresentation;
import libact4e.impl.ArrayFiniteSet;
import libact4e.impl.ArrayFiniteSetRepresentation;
import libact4e.utils.UnderDevelopment;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collection;
import java.util.HashSet;

public class Sandbox {

    private final ObjectMapper mapper = new ObjectMapper(new YAMLFactory());

    public static void main(String[] args) throws Exception {
        new Sandbox().whatNeedsToBeImplemented();
    }

    public void whatNeedsToBeImplemented() throws Exception {
        final Collection<String> underDevelopment = new HashSet<>();
        final Collection<String> toImplement = new HashSet<>();

        // search interfaces
        ClassPath classPath = ClassPath.from(Thread.currentThread().getContextClassLoader());
        final ImmutableSet<ClassInfo> libact4e = classPath.getTopLevelClasses("libact4e");
        for (ClassInfo classInfo : libact4e) {
            final Class<?> clazz = Class.forName(classInfo.getName());
            if (!clazz.isInterface()) continue;

            final String simpleName = clazz.getSimpleName();
            if (!simpleName.contains("Finite")) continue;

            final UnderDevelopment annotation = clazz.getAnnotation(UnderDevelopment.class);

            if (annotation == null) {
                toImplement.add(simpleName);
            } else {
                underDevelopment.add(simpleName);
            }
        }

        // search classes
        classPath = ClassPath.from(Thread.currentThread().getContextClassLoader());
        final ImmutableSet<ClassInfo> impl = classPath.getTopLevelClasses("libact4e.impl");
        for (ClassInfo classInfo : impl) {
            final Class<?> clazz = Class.forName(classInfo.getName());

            final String simpleName = clazz.getSimpleName();
            if (simpleName.contains("Array") || simpleName.contains("Impl")) continue;

            final UnderDevelopment annotation = clazz.getAnnotation(UnderDevelopment.class);

            if (annotation == null) {
                toImplement.add(simpleName);
            } else {
                underDevelopment.add(simpleName);
            }
        }

        final String toImplementText = "To Implement:\n" + String.join("\n", toImplement);
        final String underDevelopmentText = "Under Development:\n" + String.join("\n", underDevelopment);
        System.out.println(toImplementText + "\n\n" + underDevelopmentText);
    }

    public void run() throws Exception {
        final FiniteSetRepresentation representation = new ArrayFiniteSetRepresentation();
        final FiniteSet<Integer> integers = new ArrayFiniteSet<>(1, 2, 3);
        final FiniteSetRepresentation.FiniteSetDto<Integer> finiteSetDto = representation.save(integers);

        write(finiteSetDto);
        System.out.println(new String(Files.readAllBytes(Path.of("./data.yaml"))));
    }

    private FiniteSetRepresentation.FiniteSetDto<Integer> read() throws Exception {
        final JavaType javaType = mapper.getTypeFactory()
                .constructParametricType(FiniteSetRepresentation.FiniteSetDto.class, Integer.class);
        return mapper.readValue(new File("./data.yaml"), javaType);
    }

    private void write(FiniteSetRepresentation.FiniteSetDto<Integer> finiteSetDto) throws Exception {
        mapper.writeValue(new File("./data.yaml"), finiteSetDto);
    }
}
