package LibACT4E;

import java.util.List;

public interface FiniteSetProduct<E> extends FiniteSet<E> {
    List<FiniteSet> components();

    E pack(E... args);

    List<FiniteMap> projections();
}
