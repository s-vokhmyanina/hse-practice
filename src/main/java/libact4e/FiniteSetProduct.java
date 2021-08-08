package libact4e;

import java.util.List;

// todo: Подумать

public interface FiniteSetProduct<T> {
    List<FiniteSet<T>> components();

    T pack(T... args);

    List<FiniteMap<T, T>> projections();
}
