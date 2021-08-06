package libact4e;

import java.util.List;

public interface MakeSetUnion<T> {
    SetUnion<T> union(List<Setoid<T>> components);
}
