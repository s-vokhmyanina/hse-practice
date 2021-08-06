package libact4e;

import lombok.Setter;
import lombok.experimental.Accessors;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface FiniteSetRepresentation<T> {
    FiniteSet<T> load(FiniteSetDto<T> data);

    FiniteSetDto<T> save(@NotNull FiniteSet<T> finiteSet);

    @Setter
    @Accessors(chain = true)
    class FiniteSetDto<T> {
        public List<T> elements;
    }
}
