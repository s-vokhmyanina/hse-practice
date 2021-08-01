package LibACT4E;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.File;
import java.io.IOException;

public class ObjectMapperWrapper {

    private final ObjectMapper mapper;

    public ObjectMapperWrapper() {
        mapper = new ObjectMapper(new YAMLFactory());
    }

    public <T> void write(@NotNull T data, @NotNull File output) {
        try {
            mapper.writeValue(output, data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Nullable
    public <T> T read(@NotNull File input, @NotNull JavaType javaType) {
        try {
            return mapper.readValue(input, javaType);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
