package libact4e;

public interface Semigroup<T> {
    Setoid<T> carrier();

    Mapping<? extends Setoid<T>, T> composition();
}
