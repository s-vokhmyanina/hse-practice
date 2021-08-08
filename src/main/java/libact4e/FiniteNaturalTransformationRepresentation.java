package libact4e;

import lombok.Setter;
import lombok.experimental.Accessors;
import org.jetbrains.annotations.NotNull;

public interface FiniteNaturalTransformationRepresentation<K, T> {
    FiniteNaturalTransformation<K, T> load(FiniteNaturalTransformationDto<K, T> data);

    FiniteNaturalTransformationDto<K, T> save(@NotNull FiniteNaturalTransformation<K, T> finiteNaturalTransformation);

    @Setter
    @Accessors(chain = true)
    class FiniteNaturalTransformationDto<K, T> {
        public FiniteCategory<K> cat1;

        public FiniteCategory<T> cat2;
    }
}
