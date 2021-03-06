package libact4e;

import libact4e.utils.UnderDevelopment;
import lombok.Setter;
import lombok.experimental.Accessors;

@UnderDevelopment
public interface FiniteAdjunctionRepresentation {

    <K, T> FiniteAdjunction<K, T> load(FiniteAdjunctionDTO<K, T> dto);

    <K, T> FiniteAdjunctionDTO<K, T> save(FiniteAdjunction<K, T> dto);

    @Setter
    @Accessors(chain = true)
    class FiniteAdjunctionDTO<K, T> {
        public FiniteCategory<K> source;
        public FiniteCategory<T> target;
    }
}
