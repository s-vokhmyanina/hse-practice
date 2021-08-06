package LibACT4E;

public class ArrayFiniteRelationRepresentation<T, K> extends AbstractFiniteRelationRepresentation<T, K> {
    @Override
    public FiniteRelation<T, K> load(FiniteRelationRepresentation.FiniteRelationDto<T, K> data) {
        return new ArrayFiniteRelation<>(data.source, data.target);
    }
}
