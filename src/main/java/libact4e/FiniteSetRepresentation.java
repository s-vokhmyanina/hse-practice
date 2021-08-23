package libact4e;

import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;

public interface FiniteSetRepresentation {
    <T> FiniteSet<T> load(FiniteSetDto<T> data);

    <T> FiniteSetDto<T> save(FiniteSet<T> finiteSet);

    @Setter
    @Accessors(chain = true)
    class FiniteSetDto<T> {
        public List<T> elements = new ArrayList<>();
    }
}
