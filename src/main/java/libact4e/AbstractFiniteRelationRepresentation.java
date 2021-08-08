package libact4e;

import org.jetbrains.annotations.NotNull;

public abstract class AbstractFiniteRelationRepresentation<K, T> implements FiniteRelationRepresentation<K, T> {

    @Override
    public FiniteRelationDto<K, T> save(@NotNull FiniteRelation<K, T> finiteRelation) {
        final var set = new FiniteRelationDto<K, T>();

        set.source = finiteRelation.source();
        set.target = finiteRelation.target();

        return set;
    }
}
