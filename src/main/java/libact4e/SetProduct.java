package libact4e;

import java.util.List;

public interface SetProduct<T> extends Setoid<Setoid<T>> {

    List<? extends Setoid<T>> components();

    T pack(T... args);

    List<? extends Mapping<? extends Setoid<T>, T>> projections();
}
