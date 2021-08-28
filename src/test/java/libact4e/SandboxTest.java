package libact4e;

import libact4e.impl.*;
import libact4e.utils.ObjectMapperWrapper;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
        final FiniteSetRepresentation representation = new ArrayFiniteSetRepresentation();
        final FiniteSet<Integer> integers = new ArrayFiniteSet<>(1, 2, 3);
        final FiniteSetRepresentation.FiniteSetDto<Integer> finiteSetDto = representation.save(integers);

        mapper.write(finiteSetDto, new File(filePath));
        System.out.println(new String(Files.readAllBytes(Path.of(filePath))));
        Assertions.fail("implement");
    }

    @Test
    public void testArrayMap_call() {
        final ArrayFiniteMap<Integer, Integer> map = new ArrayFiniteMap<>(
                new ArrayFiniteSet<>(1, 2, 3),
                new ArrayFiniteSet<>(1, 2)
        );
        final int target = map.apply(3);
        assertEquals(1, target);
    }

    @Test
    public void testFiniteSet_toString() {
        final ArrayFiniteSet<Integer> integers = new ArrayFiniteSet<>(1, 2, 3);
        assertEquals("elements: [1, 2, 3]", integers.toString());
    }

    @Test
    public void testFiniteMap_toString() {
        final var map = new ArrayFiniteMap<>(
                FiniteSet.of("a", "b", "c"),
                FiniteSet.of(1, 2)
        );
        assertEquals(
                """
                        source:
                          elements: [a, b, c]
                        target:
                          elements: [1, 2]
                        values:
                          - [a, 1]
                          - [b, 2]
                          - [c, 1]""",
                map.toString()
        );
    }

    @Test
    public void testArraySetUnion_toString() {
        final var union = new ArraySetUnion(
                FiniteSet.of(1, 2, 3),
                FiniteSet.of("a", "b", "c")
        );
        assertEquals(
                """
                        union:
                        - elements: [1, 2, 3]
                        - elements: [a, b, c]""",
                union.toString()
        );
    }

    @Test
    public void testArrayFiniteSetProduct_toString() {
        final var product = new IntegerFiniteSetProduct(List.of(
                FiniteSet.of(1, 2),
                FiniteSet.of(3, 4)
        ));
        assertEquals(
                """
                        product:
                        - elements: [1, 2]
                        - elements: [3, 4]""",
                product.toString()
        );
    }
}
