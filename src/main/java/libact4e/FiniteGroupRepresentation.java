package libact4e;

import libact4e.utils.UnderDevelopment;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

@UnderDevelopment
public interface FiniteGroupRepresentation {
    <T> FiniteGroup<T> load(FiniteGroupDto<T> data);

    <T> FiniteGroupDto<T> save(FiniteGroup<T> finiteGroup);

    @Setter
    @Accessors(chain = true)
    class FiniteGroupDto<T> {
        public List<T> elements;
    }
}
