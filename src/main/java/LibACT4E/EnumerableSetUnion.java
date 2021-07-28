package LibACT4E;

import lombok.Setter;

import java.util.List;

public interface EnumerableSetUnion extends EnumerableSet {
    List<EnumerableSet> components();
}
