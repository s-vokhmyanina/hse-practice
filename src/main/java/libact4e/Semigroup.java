package libact4e;

public interface Semigroup<T> {
    Setoid<T> carrier();

    Mapping<T, T> composition();
}
