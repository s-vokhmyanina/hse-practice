package libact4e;

import libact4e.utils.UnderDevelopment;

@UnderDevelopment
public interface Group<T> extends Monoid<T> {
    Mapping<T, T> inverse();
}
