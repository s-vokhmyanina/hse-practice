package libact4e;

public class ArrayFiniteSetRepresentation<T> extends AbstractFiniteSetRepresentation<T> {

    @Override
    public FiniteSet<T> load(FiniteSetDto<T> data) {
        return new ArrayFiniteSet<>(data.elements);
    }
}
