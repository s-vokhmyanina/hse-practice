package libact4e.impl;

import libact4e.FiniteCategory;
import libact4e.FiniteSet;
import libact4e.Morphism;

// todo:проверить категории
public class ArrayFiniteCategory<T> implements FiniteCategory<T> {

    private final FiniteSet<T> objects;

    public ArrayFiniteCategory(FiniteSet<T> objects) {
        this.objects = objects;
    }

//    @Override
//    public Morphism<T> identity(Object ob) {
//        return null;
//    }

    @Override
    public FiniteSet<T> objects() {
        return objects;
    }

    @Override
    public FiniteSet<T> hom(T ob1, T ob2) {
        return null;
    }

//    @Override
//    public Pair<T, T> legs(Morphism<T> m) {
//        return null;
//    }
}
