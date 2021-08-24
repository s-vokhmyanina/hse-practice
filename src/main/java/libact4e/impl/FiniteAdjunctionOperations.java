package libact4e.impl;

import libact4e.FiniteAdjunction;
import libact4e.FiniteFunctor;
import libact4e.FiniteRelation;
import libact4e.utils.UnderDevelopment;

@UnderDevelopment
public class FiniteAdjunctionOperations {

    public <K, T> FiniteAdjunction<K, T> fromRelation(FiniteRelation<K, T> relation) {
        return new ArrayFiniteAdjunction<>(
                new ArrayFiniteCategory<>(relation.source()),
                new ArrayFiniteCategory<>(relation.target())
        );
    }

    public <K, T> FiniteAdjunction<K, T> compose(
            FiniteAdjunction<K, T> adj1,
            FiniteAdjunction<K, T> adj2
    ) {
        return null;
    }

    public <K, T> boolean isAdjunction(FiniteFunctor<K, T> left, FiniteFunctor<K, T> right) {
        return true;  // todo: implement
    }
}
