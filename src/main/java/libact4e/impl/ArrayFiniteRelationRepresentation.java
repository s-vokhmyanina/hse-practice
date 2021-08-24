package libact4e.impl;

import libact4e.AbstractFiniteRelationRepresentation;
import libact4e.FiniteRelation;
import libact4e.utils.UnderDevelopment;

@UnderDevelopment
public class ArrayFiniteRelationRepresentation extends AbstractFiniteRelationRepresentation {
    @Override
    public <K, T> FiniteRelation<K, T> load(FiniteRelationDto<K, T> data) {
        return new ArrayFiniteRelation<>(data.source, data.target);
    }
}
