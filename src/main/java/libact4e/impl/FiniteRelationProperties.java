package libact4e.impl;

import libact4e.FiniteRelation;
import libact4e.utils.UnderDevelopment;

@UnderDevelopment
public class FiniteRelationProperties<K, T> {
    public boolean isSurjective(FiniteRelation<K, T> fr) {
        return true;
    }

    public boolean isInjective(FiniteRelation<K, T> fr) {
        return true;
    }

    public boolean isDefinedEverywhere(FiniteRelation<K, T> fr) {
        return true;
    }

    public boolean isSingleValued(FiniteRelation<K, T> fr) {
        return true;
    }
}
