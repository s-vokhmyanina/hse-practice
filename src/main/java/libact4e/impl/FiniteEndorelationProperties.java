package libact4e.impl;

import libact4e.FiniteRelation;
import libact4e.utils.UnderDevelopment;

@UnderDevelopment
public class FiniteEndorelationProperties {
    public <K, T> boolean isReflexive(FiniteRelation<K, T> fr) {
        return true;
    }

    public <K, T> boolean isIrreflexive(FiniteRelation<K, T> fr) {
        return true;
    }

    public <K, T> boolean isTransitive(FiniteRelation<K, T> fr) {
        return true;
    }

    public <K, T> boolean isSymmetric(FiniteRelation<K, T> fr) {
        return true;
    }

    public <K, T> boolean isAntisymmetric(FiniteRelation<K, T> fr) {
        return true;
    }

    public <K, T> boolean isAsymmetric(FiniteRelation<K, T> fr) {
        return true;
    }
}
