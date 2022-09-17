package libact4e;

public interface MonoidalPosetOperations<E> {
    //Implementation of finite posets.

    //Check that the pair of poset and monoid make together a monoidal poset.
    boolean is_monoidal_poset(FinitePoset<E> fp, FiniteMonoid<E> fm);
}
