package libact4e;

import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

public interface FiniteMonoidRepresentation {
    <T> FiniteMonoid<T> load(FiniteMonoidDto<T> data);

    <T> FiniteMonoidDto<T> save(FiniteMonoid<T> finiteMonoid);

    @Setter
    @Accessors(chain = true)
    class FiniteMonoidDto<T> {
        public List<T> elements;
    }
}
