package libact4e;

public interface FiniteCategory<T> extends FiniteSemiCategory<T>, Category<T> {
    FiniteSet<T> objects();

    FiniteSet<T> hom(T ob1, T ob2);
}



