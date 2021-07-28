package LibACT4E;

import java.util.List;

public interface SetProduct<T> extends Setoid<T> {

    List<Setoid<T>> components();

    T pack(T... args);

    List<Mapping<T>> projections();
}