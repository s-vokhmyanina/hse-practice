package libact4e;

public interface MonoidalPoset<E> {
    //Implementation of finite posets.

    Poset<E> poset();

    Monoid<E> monoid();

}
