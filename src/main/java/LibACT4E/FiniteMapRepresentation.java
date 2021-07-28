package LibACT4E;

import lombok.Setter;
import lombok.experimental.Accessors;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface FiniteMapRepresentation<T> {
    FiniteMap<T> load(FiniteMapRepresentation.FiniteMapDto<T> data);

    FiniteMapRepresentation.FiniteMapDto<T> save(@NotNull FiniteMap<T> finiteMap);

    @Setter
    @Accessors(chain = true)
    class FiniteMapDto<T> {
        public List<T> elements;
    }
}
