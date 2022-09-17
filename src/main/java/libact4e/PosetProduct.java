package libact4e;

import javax.sound.midi.Sequence;
import libact4e.utils.UnderDevelopment;

@UnderDevelopment
public interface PosetProduct<C, E extends Setoid<C>> {
    //A poset product is a poset that can be factorized.

    //Returns the components of the product
    SetProduct<C, E> carrier();

    //Returns the components of the product
    //Sequence<Poset<C>> components();
}
