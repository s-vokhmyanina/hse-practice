package libact4e.impl;

import libact4e.AbstractFiniteSetRepresentation;
import libact4e.FiniteSet;

public class ArrayFiniteSetRepresentation extends AbstractFiniteSetRepresentation {

    @Override
    public <T> FiniteSet<T> load(FiniteSetDto<T> data) {
        return new ArrayFiniteSet<>(data.elements);
    }
}
