package libact4e;

public class ArrayFiniteRelationRepresentation<K, T> extends AbstractFiniteRelationRepresentation<K, T> {
    @Override
    public FiniteRelation<K, T> load(FiniteRelationRepresentation.FiniteRelationDto<K, T> data) {
        return new ArrayFiniteRelation<>(data.source, data.target);
    }
}
