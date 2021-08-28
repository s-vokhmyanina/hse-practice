package libact4e;

public interface FiniteSemigroup<T> extends Semigroup<T> {
    FiniteSet<T> carrier();

    FiniteMap<? extends FiniteSet<T>, T> composition();
}
