package libact4e.impl;

import libact4e.FiniteSemigroup;
import libact4e.FiniteSemigroupRepresentation;

public class ArrayFiniteSemigroupRepresentation implements FiniteSemigroupRepresentation {

    @Override
    public <T> FiniteSemigroup<T> load(FiniteSemigroupDto<T> data) {
        return new ArrayFiniteSemigroup<T>(data.carrier, data.composition);
    }

    @Override
    public <T> FiniteSemigroupDto<T> save(FiniteSemigroup<T> finiteSemigroup) {
        return new FiniteSemigroupDto<T>()
                .setCarrier(finiteSemigroup.carrier())
                .setComposition(finiteSemigroup.composition());
    }
}
