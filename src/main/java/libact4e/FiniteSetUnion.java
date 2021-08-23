package libact4e;

import java.util.List;

public interface FiniteSetUnion extends EnumerableSetUnion {
    List<? extends FiniteSet<?>> components();
}
