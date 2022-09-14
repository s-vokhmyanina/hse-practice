package libact4e.impl.helper;

import java.lang.reflect.Type;
import java.util.Map;

public interface IOHelper {
    //Load from the filesystem.
    Map<String, Type> loadfile(String name);
}