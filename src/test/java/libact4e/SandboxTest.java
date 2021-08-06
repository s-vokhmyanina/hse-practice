package libact4e;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

public class SandboxTest {

    private static ObjectMapperWrapper mapper;
    private final static String filePath = "./data.yaml";

    @BeforeAll
    public static void setUpData() {
        mapper = new ObjectMapperWrapper();
    }

    @AfterEach
    public void tearDown() throws Exception {
        Files.deleteIfExists(Path.of(filePath));
    }

    @Test
    public void testArrayFiniteSetRepresentation_yaml() throws Exception {
        final FiniteSetRepresentation<Integer> representation = new ArrayFiniteSetRepresentation<>();
        final FiniteSet<Integer> integers = new ArrayFiniteSet<>(1, 2, 3);
        final FiniteSetRepresentation.FiniteSetDto<Integer> finiteSetDto = representation.save(integers);

        mapper.write(finiteSetDto, new File(filePath));
        System.out.println(new String(Files.readAllBytes(Path.of(filePath))));
        Assertions.fail("implement");
    }

    @Test
    public void testArrayMap_call() {
        final ArrayMap<Integer, Integer> map = new ArrayMap<>(
                new ArrayFiniteSet<>(1, 2, 3),
                new ArrayFiniteSet<>(1, 2)
        );
        final int target = map.call(3);
        assertEquals(1, target);
    }
}
