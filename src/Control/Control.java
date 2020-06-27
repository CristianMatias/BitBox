package Control;

import java.util.List;

/**
 *
 * @author Cristian
 */
public interface Control {
    public boolean logUser(String name, String password);
    public List readItems();
}
