package libact4e;

// todo: Возможно это можно удалить
public interface SemiCategory<T> {
    Setoid<T> objects();

    Setoid<T> hom(T ob1, T ob2);
}
