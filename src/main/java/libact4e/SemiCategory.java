package libact4e;
// todo: Возможно это можно удалить
public interface SemiCategory<T> {
    Setoid objects();

    Setoid hom( T ob1, T ob2);
}
