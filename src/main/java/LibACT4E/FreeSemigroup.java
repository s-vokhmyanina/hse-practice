package LibACT4E;

public interface FreeSemigroup<T> extends Semigroup<T> {
    T unit(T a);
}
