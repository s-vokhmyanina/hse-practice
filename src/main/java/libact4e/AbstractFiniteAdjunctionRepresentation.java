package libact4e;

import libact4e.utils.UnderDevelopment;

@UnderDevelopment
public abstract class AbstractFiniteAdjunctionRepresentation implements FiniteAdjunctionRepresentation {

    @Override
    public <K, T> FiniteAdjunctionDTO<K, T> save(FiniteAdjunction<K, T> dto) {
        return new FiniteAdjunctionDTO<K, T>()
                .setSource(dto.source())
                .setTarget(dto.target());
    }
}
