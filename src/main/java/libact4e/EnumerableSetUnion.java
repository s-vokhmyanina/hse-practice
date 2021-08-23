package libact4e;

import java.util.List;

public interface EnumerableSetUnion extends SetUnion {

    List<? extends EnumerableSet<?>> components();
}
