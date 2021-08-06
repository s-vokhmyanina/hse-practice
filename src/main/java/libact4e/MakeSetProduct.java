package libact4e;

import java.util.List;

public interface MakeSetProduct<T> {
    SetProduct<T> product(List<Setoid<T>> components);
}
