package libact4e.impl;

import libact4e.FinitePoset;
import libact4e.FiniteSet;

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

    public boolean isAntiChain(FinitePoset<T> fp, FiniteSet<T> s) {
        return true;
    }
}
