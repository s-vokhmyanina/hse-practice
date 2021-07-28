package LibACT4E;

public interface Monoid<T> extends Semigroup<T> {
    T identity();
}
