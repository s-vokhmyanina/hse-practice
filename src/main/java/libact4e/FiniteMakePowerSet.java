package libact4e;

public interface FiniteMakePowerSet<C, Any> {
    FiniteSetOfFiniteSubsets<C, Any> powerset(FiniteSet<C> s);
}
