package libact4e;

public interface FreeSemigroup<T> extends Semigroup<T> {
    T unit(T a);
}
