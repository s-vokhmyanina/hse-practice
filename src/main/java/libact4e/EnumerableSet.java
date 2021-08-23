package libact4e;

import java.util.Iterator;

// может есть смысл дропнуть этот интерфейс, т.к он бесполезный
public interface EnumerableSet<T> extends Setoid<T> {
    Iterator<T> elements();

    default Iterator<T> iterator() {
        return elements();
    }
}
