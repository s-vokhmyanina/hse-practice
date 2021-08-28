package libact4e;

import java.util.List;
import java.util.function.BiFunction;

// todo: Подумать

//  здесь должно быть наследование от FiniteSet, но похоже, что это невозможно сделать
public interface FiniteSetProduct<T, C extends FiniteSet<T>> extends SetProduct<T, C> {
    List<C> components();

    List<? extends FiniteMap<C, T>> projections();
}
