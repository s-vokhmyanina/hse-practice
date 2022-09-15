package libact4e;

public interface FinitePosetOfFiniteSubsets<C, E> extends  PosetOfFiniteSubsets<C,E>{
    FiniteSetOfFiniteSubsets<E, C> carrier();
}
