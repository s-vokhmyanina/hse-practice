package LibACT4E;

public interface Mapping<T> {
    Setoid<T> source();

    Setoid<T> target();

    private T __call__(T a) {
        return a;
    }
}
