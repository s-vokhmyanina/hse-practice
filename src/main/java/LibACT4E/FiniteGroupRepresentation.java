package LibACT4E;

import lombok.Setter;
import lombok.experimental.Accessors;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface FiniteGroupRepresentation<T> {
    FiniteGroup<T> load(FiniteGroupRepresentation.FiniteGroupDto<T> data);

    FiniteGroupRepresentation.FiniteGroupDto<T> save(@NotNull FiniteGroup<T> finiteGroup);

    @Setter
    @Accessors(chain = true)
    class FiniteGroupDto<T> {
        public List<T> elements;
    }
}