package libact4e;
import libact4e.impl.Pair;

public interface SemiCategory<T> {
    Setoid<T> objects();

    Setoid<T> hom(T ob1, T ob2);

    // для чего это ? не понятно   Pair<T, T> legs(Morphism<T> m);
}
