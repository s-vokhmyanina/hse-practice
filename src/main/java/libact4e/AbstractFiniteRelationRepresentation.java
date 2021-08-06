package libact4e;

import org.jetbrains.annotations.NotNull;

public abstract class AbstractFiniteRelationRepresentation<T, K> implements FiniteRelationRepresentation<T, K> {
    // todo: отрефакторить это пото
    @Override
    public FiniteRelationDto<T, K> save(@NotNull FiniteRelation<T, K> finiteRelation) {
        final var set = new FiniteRelationDto<T, K>();
        set.source = finiteRelation.source();
        set.target = finiteRelation.target();

        return set;
    }
}
