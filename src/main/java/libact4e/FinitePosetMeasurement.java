package libact4e;

import libact4e.utils.UnderDevelopment;

@UnderDevelopment
public interface FinitePosetMeasurement<T> {
    //Return the width of the poset.
    Integer width(FinitePoset<T> fp);

    //Return the height of the poset.
    Integer height(FinitePoset<T> fp);
}
