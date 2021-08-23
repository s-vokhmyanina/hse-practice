package libact4e;

public abstract class AbstractFiniteSetRepresentation implements FiniteSetRepresentation {

    @Override
    public <T> FiniteSetDto<T> save(FiniteSet<T> finiteSet) {
        final var set = new FiniteSetDto<T>();

        for (T t : finiteSet) {
            set.elements.add(t);
        }

        return set;
    }
}
