package libact4e;

import java.util.List;

public interface RupeGoldbergSolver {
    Solution hangthem(List<Component> components);

    Solution push(List<Component> components, float force);

    Solution pull(List<Component> components, float force);

}
