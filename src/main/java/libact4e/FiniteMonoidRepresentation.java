package libact4e;

import lombok.Setter;
import lombok.experimental.Accessors;

public interface FiniteMonoidRepresentation {
    <T> FiniteMonoid<T> load(FiniteMonoidDto<T> data);

    <T> FiniteMonoidDto<T> save(FiniteMonoid<T> finiteMonoid);

    @Setter
    @Accessors(chain = true)
    class FiniteMonoidDto<T> {
        public T neutral;
        public FiniteSet<T> elements;
        public FiniteMap<T, T> values;
    }
}
