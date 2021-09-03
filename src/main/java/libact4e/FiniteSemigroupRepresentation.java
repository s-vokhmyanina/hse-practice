package libact4e;

import lombok.Setter;
import lombok.experimental.Accessors;

public interface FiniteSemigroupRepresentation {
    <T> FiniteSemigroup<T> load(FiniteSemigroupDto<T> data);

    <T> FiniteSemigroupDto<T> save(FiniteSemigroup<T> finiteSemigroup);

    @Setter
    @Accessors(chain = true)
    class FiniteSemigroupDto<T> {
        public FiniteSet<T> carrier;
        public FiniteMap<? extends FiniteSet<T>, T> composition;
    }
}
