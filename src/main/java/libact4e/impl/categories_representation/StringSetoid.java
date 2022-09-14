package libact4e.impl.categories_representation;

import libact4e.Setoid;
import libact4e.impl.helper.IOHelper;

import java.util.Iterator;

public class StringSetoid implements Setoid<String> {

    @Override
    public boolean contains(String x) {
        return true;
    }

    public String save(IOHelper p, String x){
        return  x;
    }

    public String load(IOHelper p, String o){
        return o;
    }

    @Override
    public Iterator<String> iterator() {
        return null;
    }
}