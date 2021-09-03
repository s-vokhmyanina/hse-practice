package libact4e;

import libact4e.impl.*;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Libact4eTests {

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
    public void testFiniteMap_toString_simple() {
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
    public void testFiniteMap_toString_complex() {
        final var map = new ArrayFiniteMap<>(
                FiniteSetProduct.of((Integer i1, Integer i2) -> i1 * i2, FiniteSet.of(0, 1)),
                FiniteSet.of(1, 2)
        );
        System.out.println(map);
        assertEquals(
                """
                        source:
                          product:
                            - elements: [0, 1]
                        target:
                          elements: [1, 2]
                        values:
                          - [[0, 1], 1]""",
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
        final var product = FiniteSetProduct.of(
                (Integer i1, Integer i2) -> i1 * i2,
                List.of(
                        FiniteSet.of(1, 2),
                        FiniteSet.of(3, 4)
                )
        );
        assertEquals(
                """
                        product:
                          - elements: [1, 2]
                          - elements: [3, 4]""",
                product.toString()
        );
    }

    @Test
    public void testArrayFiniteSemigroup_toString() {
        final ArrayFiniteSemigroup<Integer> semigroup = new ArrayFiniteSemigroup<>(
                FiniteSet.of(0, 1),
                (i1, i2) -> i1 * i2
        );
        assertEquals(
                """
                        carrier:
                          elements: [0, 1]
                        composition:
                          source:
                            product:
                              - elements: [0, 0]
                              - elements: [0, 1]
                              - elements: [1, 0]
                              - elements: [1, 1]
                          target:
                            elements: [0, 0, 0, 1]
                          values:
                            - [[0, 0], 0]
                            - [[0, 1], 0]
                            - [[1, 0], 0]
                            - [[1, 1], 1]""",
                semigroup.toString()
        );
    }

    @Test
    public void testArrayFiniteMonoid_toString() {
        final var monoid = new ArrayFiniteMonoid<>(
                1,
                FiniteSet.of(0, 1), (i1, i2) -> i1 * i2
        );
        assertEquals(
                """
                        carrier:
                          elements: [0, 1]
                        composition:
                          source:
                            product:
                              - elements: [0, 0]
                              - elements: [0, 1]
                              - elements: [1, 0]
                              - elements: [1, 1]
                          target:
                            elements: [0, 0, 0, 1]
                          values:
                            - [[0, 0], 0]
                            - [[0, 1], 0]
                            - [[1, 0], 0]
                            - [[1, 1], 1]
                        neutral: 1""",
                monoid.toString()
        );
    }
}
