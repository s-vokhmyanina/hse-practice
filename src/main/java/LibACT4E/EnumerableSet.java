package LibACT4E;

import java.util.Iterator;

public interface EnumerableSet<E> extends Setoid<E> {
    Iterator<E> elements();

    default Iterator<E> iterator() {
        return elements();
    }
}
