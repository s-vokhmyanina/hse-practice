package libact4e;

public interface FinitePosetConstructionPower<C, Any> {
    FinitePosetOfFiniteSubsets<C, Any> poweposet(FiniteSet<C> s);
}
