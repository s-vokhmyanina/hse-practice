package libact4e;

import lombok.Setter;
import lombok.experimental.Accessors;

public interface FiniteRelationRepresentation {
    <K, T> FiniteRelation<K, T> load(FiniteRelationDto<K, T> data);

    <K, T> FiniteRelationDto<K, T> save(FiniteRelation<K, T> finiteRelation);

    @Setter
    @Accessors(chain = true)
    class FiniteRelationDto<K, T> {
        public FiniteSet<K> source;
        public FiniteSet<T> target;
    }
}
