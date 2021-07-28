package LibACT4E;

public interface Group<T> extends Monoid<T> {
    Mapping<T> inverse();
}
