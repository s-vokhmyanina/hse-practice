package LibACT4E;

public interface FiniteSemigroup<T> extends Semigroup<T> {
    FiniteSet<T> carrier();

    FiniteMap<T, T> composition();
}
