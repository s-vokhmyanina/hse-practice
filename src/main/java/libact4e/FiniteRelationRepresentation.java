package libact4e;

import lombok.Setter;
import lombok.experimental.Accessors;
import org.jetbrains.annotations.NotNull;

public interface FiniteRelationRepresentation<T, K> {
    FiniteRelation<T, K> load(FiniteRelationDto<T, K> data);

    FiniteRelationDto<T, K> save(@NotNull FiniteRelation<T, K> finiteRelation);

    @Setter
    @Accessors(chain = true)
    class FiniteRelationDto<T, K> {
        public FiniteSet<T> source;
        public FiniteSet<K> target;
    }
}