package libact4e.impl;

import libact4e.FiniteMonoid;
import libact4e.FiniteMonoidRepresentation;

public class ArrayFiniteMonoidRepresentation implements FiniteMonoidRepresentation {

    @Override
    public <T> FiniteMonoid<T> load(FiniteMonoidDto<T> data) {
        return new ArrayFiniteMonoid<T>(data.neutral, data.elements, data.values);
    }

    @Override
    public <T> FiniteMonoidDto<T> save(FiniteMonoid<T> finiteMonoid) {
        return new FiniteMonoidDto<T>()
                .setNeutral(finiteMonoid.identity())
                .setElements(finiteMonoid.carrier())
                .setValues(finiteMonoid.composition());
    }
}
