package libact4e;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public interface FiniteSetProduct<T, C extends FiniteSet<T>> extends SetProduct<T, C>, FiniteSet<C> {

    List<C> components();

    List<? extends FiniteMap<C, T>> projections();

    @SafeVarargs
    static <T> FiniteSetProduct<T, FiniteSet<T>> of(
            BiFunction<T, T, T> projectionFunction,
            FiniteSet<T>... components
    ) {
        return of(projectionFunction, Arrays.asList(components));
    }

    static <T> FiniteSetProduct<T, FiniteSet<T>> of(
            BiFunction<T, T, T> projectionFunction,
            List<? extends FiniteSet<T>> components
    ) {
        return new AbstractArrayFiniteSetProduct<>(components) {
            @Override
            protected BiFunction<T, T, T> projectionFunction() {
                return projectionFunction;
            }
        };
    }
}
