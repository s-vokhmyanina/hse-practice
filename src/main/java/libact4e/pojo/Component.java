package libact4e.pojo;

import libact4e.utils.UnderDevelopment;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@UnderDevelopment
public class Component {
    private float mass;
    private float length;
    private float springConstPull;
    private float springConstPush;
}
