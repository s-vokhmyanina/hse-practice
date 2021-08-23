package libact4e;

import java.util.List;

public interface MakeSetUnion {
    FiniteSetUnion union(List<? extends Setoid<?>> components);
}
