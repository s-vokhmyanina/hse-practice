package libact4e;

public class FinitePosetProperties<T> {
    int width(FinitePoset<T> fp) {
        return 0;
    }

    int height(FinitePoset<T> fp) {
        return 0;
    }

    boolean isChain(FinitePoset<T> fp, FiniteSet<T> s) {
        return true;
    }

    boolean isAntichain(FinitePoset<T> fp, FiniteSet<T> s) {
        return true;
    }
}
