package libact4e;

import libact4e.utils.UnderDevelopment;
import lombok.Setter;
import lombok.experimental.Accessors;

@UnderDevelopment
public interface FiniteNaturalTransformationRepresentation {
    <K, T> FiniteNaturalTransformation<K, T> load(FiniteNaturalTransformationDto<K, T> data);

    <K, T> FiniteNaturalTransformationDto<K, T> save(
            FiniteNaturalTransformation<K, T> finiteNaturalTransformation
    );

    @Setter
    @Accessors(chain = true)
    class FiniteNaturalTransformationDto<K, T> {
        public FiniteCategory<K> cat1;

        public FiniteCategory<T> cat2;
    }
}
