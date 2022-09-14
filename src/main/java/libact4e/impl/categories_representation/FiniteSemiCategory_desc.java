package libact4e.impl.categories_representation;
import libact4e.utils.UnderDevelopment;

import java.util.Map;

@UnderDevelopment
public class FiniteSemiCategory_desc<T> {
    Map<String, Objects_desc<T>> objects;
    Map<String, Morphisms_desc<T>> morphisms;
}
