package libact4e;

import libact4e.impl.Component;
import libact4e.impl.Solution;

import java.util.List;

public interface RupeGoldbergSolver {

    Solution hangthem(List<Component> components);

    Solution push(List<Component> components, float force);

    Solution pull(List<Component> components, float force);
}
