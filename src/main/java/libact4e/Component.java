package libact4e;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Component {
    float mass;
    float length;
    float springConstPull;
    float springConstPush;
}
