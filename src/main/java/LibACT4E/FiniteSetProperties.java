package LibACT4E;

public interface FiniteSetProperties {
    boolean is_subset(FiniteSet a, FiniteSet b);

    default boolean equal(FiniteSet a, FiniteSet b) {
        return is_subset(a, b) && is_subset(b, a);
    }

    default boolean is_strict_subset(FiniteSet a, FiniteSet b) {
        return is_subset(a, b) && !is_subset(b, a);
    }
}
