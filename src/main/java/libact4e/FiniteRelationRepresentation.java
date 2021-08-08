package libact4e;

import lombok.Setter;
import lombok.experimental.Accessors;
import org.jetbrains.annotations.NotNull;

public interface FiniteRelationRepresentation<K, T> {
    FiniteRelation<K, T> load(FiniteRelationDto<K, T> data);

    FiniteRelationDto<K, T> save(@NotNull FiniteRelation<K, T> finiteRelation);

    @Setter
    @Accessors(chain = true)
    class FiniteRelationDto<K, T> {
        public FiniteSet<K> source;
        public FiniteSet<T> target;
    }
}