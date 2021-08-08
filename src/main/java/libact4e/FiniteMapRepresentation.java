package libact4e;

import lombok.Setter;
import lombok.experimental.Accessors;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface FiniteMapRepresentation<K, T> {
    FiniteMap<K, T> load(FiniteMapDto<K, T> data);

    FiniteMapDto<K, T> save(@NotNull FiniteMap<K, T> finiteMap);

    @Setter
    @Accessors(chain = true)
    class FiniteMapDto<K, T> {
        public List<K> source;
        public List<T> target;
    }
}
