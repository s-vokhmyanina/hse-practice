package LibACT4E;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DictMap<T> implements Mapping<T>{
    final private List<T> source = new ArrayList<>();
    final private List<T> target = new ArrayList<>();
    // or final private Map<String, T> dictionary = new HashMap<String, T>();

    public DictMap(List<T> source, List<T> target) {
        this.source.addAll(source);
        this.target.addAll(target);
    }
    @Override
    public Setoid source() {
        return null;
    }

    @Override
    public Setoid target() {
        return null;
    }

}
