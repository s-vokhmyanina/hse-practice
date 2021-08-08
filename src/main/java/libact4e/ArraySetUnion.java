package libact4e;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraySetUnion implements SetUnion {

    private final List<Setoid<?>> components;

    public ArraySetUnion(Setoid<?>... setoids) {
        components = Arrays.asList(setoids);
    }

    @Override
    public List<Setoid<?>> components() {
        return new ArrayList<>(components);
    }

    @Override
    public String toString() {
        if (components.isEmpty()) return "union: []";

        final StringBuilder builder = new StringBuilder().append("union:");
        for (Setoid<?> component : components) {
            builder.append('\n').append("- ").append(component.toString());
        }
        return builder.toString();
    }
}
