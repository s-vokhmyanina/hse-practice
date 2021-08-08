package libact4e;

public interface FiniteMonoidalPoset<T> {
    FinitePoset<T> poset();

    FiniteMonoid<T> monoid();
}
