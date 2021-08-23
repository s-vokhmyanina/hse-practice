package libact4e;

// зачем identity ???
public interface Monoid<T> extends Semigroup<T> {
    T identity();
}
