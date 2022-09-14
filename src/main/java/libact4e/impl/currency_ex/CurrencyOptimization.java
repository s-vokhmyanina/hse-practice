package libact4e.impl.currency_ex;

import libact4e.SemiCategory;
import libact4e.impl.categories_representation.RichMorphism;
import libact4e.impl.categories_representation.RichObject;
import libact4e.utils.UnderDevelopment;

@UnderDevelopment
public interface CurrencyOptimization {
    //Returns the optimal path for converting a certain amount from source to target.
    //        Raises InvalidValue if there is no path.
    OptimalSolution compute_optimal_conversion(SemiCategory<RichObject<String>> available,
                                               String source,
                                               float amount,
                                               String target);
}
