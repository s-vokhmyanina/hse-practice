package libact4e;

import libact4e.utils.UnderDevelopment;

@UnderDevelopment
public interface FinitePosetRepresentation {

    <T> FinitePoset<T> load(FinitePosetDTO<T> data);

    <T> FinitePosetDTO<T> save(FinitePoset<T> data);

    class FinitePosetDTO<T> {
    }
}
