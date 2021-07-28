package LibACT4E;

import java.util.List;

public interface MakeSetUnion {
    //todo: фигня с перегрузкой :с
    FiniteSetUnion unionF(List<FiniteSet> components);

    EnumerableSetUnion unionE(List<EnumerableSet> components);

    SetUnion union(List<Setoid> components);
}
