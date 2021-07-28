package LibACT4E;

import java.util.List;

public interface MakeSetProduct<T> {
    SetProduct<T> product(List<Setoid<T>> components);
}
