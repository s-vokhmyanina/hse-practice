package libact4e.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Component {
    private float mass;
    private float length;
    private float springConstPull;
    private float springConstPush;
}
