package LibACT4E;

import org.jetbrains.annotations.NotNull;

public interface FiniteMapRepresentation {
    FiniteMap load(FiniteMap data);

    FiniteMap save(@NotNull FiniteMap finiteMap);
}
