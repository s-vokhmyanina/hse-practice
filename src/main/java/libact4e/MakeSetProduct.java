package libact4e;

import java.util.List;
import java.util.function.BiFunction;

public interface MakeSetProduct {

    <T> SetProduct<T, Setoid<T>> product(
            BiFunction<T, T, T> projectionFunction,
            List<? extends Setoid<T>> components
    );

    <T> FiniteSetProduct<T, FiniteSet<T>> finiteProduct(
            BiFunction<T, T, T> projectionFunction,
            List<? extends FiniteSet<T>> components
    );
}
