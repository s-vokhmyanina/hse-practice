package libact4e;

import libact4e.utils.UnderDevelopment;

@UnderDevelopment
public interface FinitePoset<T> extends Poset<T> {
    FiniteSet<T> carrier();
}
