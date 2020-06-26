package Model;

import Model.Item.Item;
import java.util.List;

/**
 *
 * @author Cristian
 */
public interface Model {
    public List<Item> readAll();
    public boolean logUser(String name, String password);
}
