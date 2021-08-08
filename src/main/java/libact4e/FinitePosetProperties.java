package libact4e;

public class FinitePosetProperties<T> {
    public int width(FinitePoset<T> fp) {
        return 0;
    }

    public int height(FinitePoset<T> fp) {
        return 0;
    }

    public boolean isChain(FinitePoset<T> fp, FiniteSet<T> s) {
        return true;
    }

    public boolean isAntichain(FinitePoset<T> fp, FiniteSet<T> s) {
        return true;
    }
}
