package LibACT4E;

public interface FiniteGroup<T> extends Group<T>, FiniteMonoid<T> {
    FiniteMap<T, T> inverse();
}
