package libact4e.impl;

import libact4e.AbstractFiniteAdjunctionRepresentation;
import libact4e.FiniteAdjunction;

public class ArrayFiniteAdjunctionRepresentation extends AbstractFiniteAdjunctionRepresentation {

    @Override
    public <K, T> FiniteAdjunction<K, T> load(FiniteAdjunctionDTO<K, T> dto) {
        return new ArrayFiniteAdjunction<>(dto.source, dto.target);
    }
}
