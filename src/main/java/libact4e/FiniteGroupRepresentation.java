package libact4e;

import lombok.Setter;
import lombok.experimental.Accessors;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface FiniteGroupRepresentation<T> {
    FiniteGroup<T> load(FiniteGroupDto<T> data);

    FiniteGroupDto<T> save(@NotNull FiniteGroup<T> finiteGroup);

    @Setter
    @Accessors(chain = true)
    class FiniteGroupDto<T> {
        public List<T> elements;
    }
}
