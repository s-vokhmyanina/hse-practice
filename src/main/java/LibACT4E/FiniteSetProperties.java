package LibACT4E;

public interface FiniteSetProperties<T> {
    boolean is_subset(FiniteSet<T> a, FiniteSet<T> b);

    default boolean equal(FiniteSet<T> a, FiniteSet<T> b) {
        return is_subset(a, b) && is_subset(b, a);
    }

    default boolean is_strict_subset(FiniteSet<T> a, FiniteSet<T> b) {
        return is_subset(a, b) && !is_subset(b, a);
    }
}
