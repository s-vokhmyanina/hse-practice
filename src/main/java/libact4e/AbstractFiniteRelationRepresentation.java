package libact4e;

import libact4e.utils.UnderDevelopment;

@UnderDevelopment
public abstract class AbstractFiniteRelationRepresentation implements FiniteRelationRepresentation {

    @Override
    public <K, T> FiniteRelationDto<K, T> save(FiniteRelation<K, T> finiteRelation) {
        return new FiniteRelationDto<K, T>()
                .setSource(finiteRelation.source())
                .setTarget(finiteRelation.target());
    }
}
