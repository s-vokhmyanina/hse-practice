package libact4e;

public interface Monoid<T> extends Semigroup<T> {
    T identity();
}
