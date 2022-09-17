package libact4e;

import libact4e.utils.UnderDevelopment;

@UnderDevelopment
public class FiniteMonotoneMap<E1, E2> implements Mapping<E1, E2>{
    FinitePoset<E1> source_poset(){
        return null;
    }

    FinitePoset<E2> target_poset(){
        return null;
    }

    @Override
    public Setoid<E1> source() {
        return null;
    }

    @Override
    public Setoid<E2> target() {
        return null;
    }

    @Override
    public E2 apply(E1 e1) {
        return null;
    }
}