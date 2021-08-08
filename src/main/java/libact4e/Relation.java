package libact4e;

// todo: Возможно это можно удалить
public interface Relation<K, T> {
    Setoid<K> source();

    Setoid<T> target();
}
