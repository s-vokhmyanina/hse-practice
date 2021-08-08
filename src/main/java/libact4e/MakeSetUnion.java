package libact4e;

import java.util.List;

public interface MakeSetUnion {
    SetUnion union(List<Setoid<?>> components);
}
