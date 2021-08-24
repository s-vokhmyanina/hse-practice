package libact4e;

import libact4e.pojo.Component;
import libact4e.pojo.Solution;
import libact4e.utils.UnderDevelopment;

import java.util.List;

@UnderDevelopment
public interface RupeGoldbergSolver {

    Solution hangthem(List<Component> components);

    Solution push(List<Component> components, float force);

    Solution pull(List<Component> components, float force);
}
