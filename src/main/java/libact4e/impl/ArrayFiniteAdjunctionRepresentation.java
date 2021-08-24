package libact4e.impl;

import libact4e.AbstractFiniteAdjunctionRepresentation;
import libact4e.FiniteAdjunction;
import libact4e.utils.UnderDevelopment;

@UnderDevelopment
public class ArrayFiniteAdjunctionRepresentation extends AbstractFiniteAdjunctionRepresentation {

    @Override
    public <K, T> FiniteAdjunction<K, T> load(FiniteAdjunctionDTO<K, T> dto) {
        return new ArrayFiniteAdjunction<>(dto.source, dto.target);
    }
}
