package libact4e;

import java.util.List;

public interface SetProduct<T, C extends Setoid<T>> extends Setoid<C> {

    List<C> components();

    T pack(T... args);

    List<? extends Mapping<C, T>> projections();
}
