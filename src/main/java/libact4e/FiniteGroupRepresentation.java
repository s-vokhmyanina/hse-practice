package libact4e;

import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

public interface FiniteGroupRepresentation {
    <T> FiniteGroup<T> load(FiniteGroupDto<T> data);

    <T> FiniteGroupDto<T> save(FiniteGroup<T> finiteGroup);

    @Setter
    @Accessors(chain = true)
    class FiniteGroupDto<T> {
        public List<T> elements;
    }
}
