package libact4e;

import libact4e.utils.UnderDevelopment;
import lombok.Setter;
import lombok.experimental.Accessors;

@UnderDevelopment
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
