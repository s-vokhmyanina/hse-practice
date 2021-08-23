package libact4e;

public abstract class AbstractFiniteAdjunctionRepresentation implements FiniteAdjunctionRepresentation {

    @Override
    public <K, T> FiniteAdjunctionDTO<K, T> save(FiniteAdjunction<K, T> dto) {
        return new FiniteAdjunctionDTO<K, T>()
                .setSource(dto.source())
                .setTarget(dto.target());
    }
}
