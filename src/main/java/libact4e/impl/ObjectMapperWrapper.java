package libact4e.impl;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.io.File;
import java.io.IOException;

public class ObjectMapperWrapper {

    private final ObjectMapper mapper;

    public ObjectMapperWrapper() {
        mapper = new ObjectMapper(new YAMLFactory());
    }

    public <T> void write(T data, File output) {
        try {
            mapper.writeValue(output, data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public <T> T read(File input, JavaType javaType) {
        try {
            return mapper.readValue(input, javaType);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
