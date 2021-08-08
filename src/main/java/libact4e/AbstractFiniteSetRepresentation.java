package libact4e;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public abstract class AbstractFiniteSetRepresentation<T> implements FiniteSetRepresentation<T> {

    @Override
    public FiniteSetDto<T> save(@NotNull FiniteSet<T> finiteSet) {
        final var set = new FiniteSetDto<T>();
        set.elements = new ArrayList<>();

        for (T t : finiteSet) {
            set.elements.add(t);
        }

        return set;
    }
}
