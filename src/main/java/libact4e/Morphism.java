package libact4e;

public interface Morphism<T> {
    Semigroup<T> func(Semigroup<T> S1);
    Monoid<T> func(Monoid<T> S1);
    Group<T> func(Group<T> S1);
}
