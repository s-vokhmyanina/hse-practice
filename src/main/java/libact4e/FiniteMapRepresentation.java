package libact4e;

import lombok.Setter;
import lombok.experimental.Accessors;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface FiniteMapRepresentation<T, K> {
    FiniteMap<T, K> load(FiniteMapDto<T, K> data);

    FiniteMapDto<T, K> save(@NotNull FiniteMap<T, K> finiteMap);

    @Setter
    @Accessors(chain = true)
    class FiniteMapDto<T, K> {
        public List<T> source;
        public List<K> target;
    }
}
