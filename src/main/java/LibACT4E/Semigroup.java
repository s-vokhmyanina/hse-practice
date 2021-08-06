package LibACT4E;

public interface Semigroup<T> {
    Setoid<T> carrier();

    Mapping<T, T> composition();
}
