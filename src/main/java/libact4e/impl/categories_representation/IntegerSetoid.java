package libact4e.impl.categories_representation;

import libact4e.Setoid;
import libact4e.impl.helper.IOHelper;

import java.util.Iterator;

public class IntegerSetoid implements Setoid<Integer> {

    @Override
    public boolean contains(Integer x) {
        return true;
    }

    public Integer save(IOHelper p, Integer x){
        return  x;
    }

    public Integer load(IOHelper p, Integer o){
        return o;
    }

    @Override
    public Iterator<Integer> iterator() {
        return null;
    }
}
