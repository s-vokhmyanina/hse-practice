package libact4e;

import java.util.List;

public interface SetUnion<T> {
    List<Setoid<T>> components();
}
