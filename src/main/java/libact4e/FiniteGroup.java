package libact4e;

public interface FiniteGroup<T> extends Group<T>, FiniteMonoid<T> {
    FiniteMap<T, T> inverse();
}
