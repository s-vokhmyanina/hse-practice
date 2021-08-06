package libact4e;

// todo: Возможно это можно удалить
public interface Relation<T, K> {
    Setoid<T> source();
    Setoid<K> target();
}
