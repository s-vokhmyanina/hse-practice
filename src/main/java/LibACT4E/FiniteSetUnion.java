package LibACT4E;

import java.util.List;

public interface FiniteSetUnion extends FiniteSet {
    List<FiniteSet> components();
}
