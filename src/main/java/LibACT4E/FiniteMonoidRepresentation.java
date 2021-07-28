package LibACT4E;

import lombok.Setter;
import lombok.experimental.Accessors;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface FiniteMonoidRepresentation<T> {
    FiniteMonoid<T> load(FiniteMonoidRepresentation.FiniteMonoidDto<T> data);

    FiniteMonoidRepresentation.FiniteMonoidDto<T> save(@NotNull FiniteMonoid<T> finiteMonoid);

    @Setter
    @Accessors(chain = true)
    class FiniteMonoidDto<T> {
        public List<T> elements;
    }
}
