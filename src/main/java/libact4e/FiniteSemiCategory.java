package libact4e;

public interface FiniteSemiCategory<T> extends SemiCategory<T> {
    FiniteSet objects();

    FiniteSet hom( T ob1, T ob2);
}
