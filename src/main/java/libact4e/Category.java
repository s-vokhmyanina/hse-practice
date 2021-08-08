package libact4e;

public interface Category<T> {
    Setoid<T> objects();

    Setoid<T> hom(T ob1, T ob2);
}
