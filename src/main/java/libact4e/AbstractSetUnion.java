package libact4e;

import java.util.List;

public abstract class AbstractSetUnion implements SetUnion {

    @Override
    public String toString() {
        final List<? extends Setoid<?>> components = components();
        if (components.isEmpty()) return "union: []";

        final StringBuilder builder = new StringBuilder().append("union:");
        for (Setoid<?> component : components) {
            builder.append('\n').append("  - ").append(component.toString());
        }
        return builder.toString();
    }
}
