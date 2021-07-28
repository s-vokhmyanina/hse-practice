package LibACT4E;

import java.util.List;

public interface MakeSetUnion<T> {
    SetUnion<T> union(List<Setoid<T>> components);
}
