package libact4e;

import java.util.List;

public interface MakeSetProduct<T> {
    SetProduct<T> product(List<? extends Setoid<T>> components);

    FiniteSetProduct<T> finiteProduct(List<? extends FiniteSet<T>> components);
}
