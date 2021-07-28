package LibACT4E;

import java.util.List;

public interface MakeSetProduct {
    //todo: опять перегрузка :с
    SetProduct product(List<Setoid> components);

    FiniteSetProduct productF(List<FiniteSet> components);

}
