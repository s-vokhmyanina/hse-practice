package LibACT4E;

public interface Mapping<E> {
    Setoid source();

    Setoid target();

    private E __call__(E a) {
        return a;
    }
}
