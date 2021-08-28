package libact4e;

import java.util.List;
import java.util.function.BiFunction;

public interface SetProduct<T, C extends Setoid<T>> extends Setoid<C> {

    List<C> components();

    T pack(BiFunction<T, T, T> function, T... args);

    List<? extends Mapping<C, T>> projections();
}
