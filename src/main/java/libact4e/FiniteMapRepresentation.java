package libact4e;

import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

public interface FiniteMapRepresentation {
    <K, T> FiniteMap<K, T> load(FiniteMapDto<K, T> data);

    <K, T> FiniteMapDto<K, T> save(FiniteMap<K, T> finiteMap);

    @Setter
    @Accessors(chain = true)
    class FiniteMapDto<K, T> {
        public List<K> source;
        public List<T> target;
    }
}
