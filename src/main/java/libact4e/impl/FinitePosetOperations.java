package libact4e.impl;

import libact4e.FinitePoset;
import libact4e.FiniteSet;

import java.util.Optional;
import java.util.Set;

// Нужны ли операции для Lower/upper sets
public class FinitePosetOperations {

    public <T> Set<T> upperClosure(FinitePoset<T> fp, Set<T> s) {
        return null;
    }

    public <T> Set<T> lowerClosure(FinitePoset<T> fp, Set<T> s) {
        return null;
    }

    public <T> Set<T> minimal(FinitePoset<T> fp, Set<T> s) {
        return null;
    }

    public <T> Set<T> maximal(FinitePoset<T> fp, Set<T> s) {
        return null;
    }

    public <T> Optional<T> infimum(FinitePoset<T> fp, Set<T> s) {
        return Optional.empty();
    }

    public <T> Optional<T> supremum(FinitePoset<T> fp, Set<T> s) {
        return Optional.empty();
    }

    public <T> Optional<T> meet(FinitePoset<T> fp, Set<T> s) {
        return Optional.empty();
    }

    public <T> Optional<T> join(FinitePoset<T> fp, Set<T> s) {
        return Optional.empty();
    }

//    public <T> FinitePoset<T> powerset(FiniteSet<T> s) {
//        return null;
//    }
//
//    public <T> FinitePoset<T> intervals(FinitePoset<T> s) {
//        return null;
//    }
//
//    public <T> FinitePoset<T> intervals2(FinitePoset<T> s) {
//        return null;
//    }
//
//    public <T> FinitePoset<T> uppersets(FinitePoset<T> s) {
//        return null;
//    }
//
//    public <T> FinitePoset<T> lowersets(FinitePoset<T> s) {
//        return null;
//    }
//
//    public <T> FinitePoset<T> discrete(FiniteSet<T> s) {
//        return null;
//    }
//
//    public <T> FinitePoset<T> product(FinitePoset<T> p1, FinitePoset<T> p2) {
//        return null;
//    }
//
//    public <T> FinitePoset<T> disjointUnion(FinitePoset<T> p1, FinitePoset<T> p2) {
//        return null;
//    }
}
