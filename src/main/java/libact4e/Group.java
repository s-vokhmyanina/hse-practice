package libact4e;

public interface Group<T> extends Monoid<T> {
    Mapping<T, T> inverse();
}
