package LibACT4E;

public interface Mapping<T> {
    Setoid<T> source();

    Setoid<T> target();

    private T call(T a) {
        return a;
    }
}
