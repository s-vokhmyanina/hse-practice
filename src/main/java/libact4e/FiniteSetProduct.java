package libact4e;

import java.util.List;

// todo: Подумать

//  здесь должно быть наследование от FiniteSet, но похоже, что это невозможно сделать
public interface FiniteSetProduct<T, C extends FiniteSet<T>> extends SetProduct<T, C> {
    List<C> components();

    T pack(T... args);

    List<? extends FiniteMap<C, T>> projections();
}
