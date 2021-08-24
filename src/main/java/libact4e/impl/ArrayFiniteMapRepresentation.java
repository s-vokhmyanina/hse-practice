package libact4e.impl;

import libact4e.FiniteMap;
import libact4e.FiniteMapRepresentation;
import libact4e.FiniteSet;

public class ArrayFiniteMapRepresentation implements FiniteMapRepresentation {
    @Override
    public <K, T> FiniteMap<K, T> load(FiniteMapDto<K, T> data) {
        return new ArrayFiniteMap<>(
                FiniteSet.of(data.source),
                FiniteSet.of(data.target)
        );
    }

    @Override
    public <K, T> FiniteMapDto<K, T> save(FiniteMap<K, T> finiteMap) {
        return new FiniteMapDto<K, T>()
                .setSource(finiteMap.source().toList())
                .setTarget(finiteMap.target().toList());
    }
}
