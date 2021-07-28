package LibACT4E;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;

public class Sandbox {

    private final ObjectMapper mapper = new ObjectMapper(new YAMLFactory());

    public static void main(String[] args) throws Exception {
        new Sandbox().run();
    }

    public void run() throws Exception {
        final FiniteSetRepresentation<Integer> representation = new ArrayFiniteSetRepresentation<>();
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
