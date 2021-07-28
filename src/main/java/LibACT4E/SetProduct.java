package LibACT4E;

import java.util.List;

public interface SetProduct<E> extends Setoid{

    List<Setoid> components();

    E pack(E... args);

    List<Mapping> projections();
}