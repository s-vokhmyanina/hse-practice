package LibACT4E;

public interface FiniteMap<T> extends Mapping<T> {
    FiniteSet<T> source();

    FiniteSet<T> target();

}
