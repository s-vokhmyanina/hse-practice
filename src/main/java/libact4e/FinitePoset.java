package libact4e;

public interface FinitePoset<T> extends Poset<T> {
    FiniteSet<T> carrier();
}
