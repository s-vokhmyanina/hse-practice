package libact4e;

import java.util.Iterator;

public interface EnumerableSet<T> extends Setoid<T> {
    Iterator<T> elements();

    default Iterator<T> iterator() {
        return elements();
    }
}
