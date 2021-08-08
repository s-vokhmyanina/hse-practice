package libact4e;

public interface FiniteSemiCategory<T> extends SemiCategory<T> {
    FiniteSet<T> objects();

    FiniteSet<T> hom(T ob1, T ob2);
}
