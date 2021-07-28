package LibACT4E;

import lombok.Setter;
import lombok.experimental.Accessors;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface FiniteSemigroupRepresentation<T> {
    FiniteSemigroup<T> load(FiniteSemigroupRepresentation.FiniteSemigroupDto<T> data);

    FiniteSemigroupRepresentation.FiniteSemigroupDto<T> save(@NotNull FiniteSemigroup<T> finiteSemigroup);

    @Setter
    @Accessors(chain = true)
    class FiniteSemigroupDto<T> {
        public List<T> elements;
    }
}
