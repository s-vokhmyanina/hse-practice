package libact4e;

import java.util.List;

// todo: Подумать

//  здесь должно быть наследование от FiniteSet, но похоже, что это невозможно сделать
public interface FiniteSetProduct<T> extends SetProduct<T> {
    List<? extends FiniteSet<T>> components();

    T pack(T... args);

    List<? extends FiniteMap<? extends FiniteSet<T>, T>> projections();
}
