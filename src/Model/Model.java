package Model;

import Model.Item.Item;
import Model.Supplier.Supplier;
import Model.User.Userlogin;
import java.util.List;

/**
 *
 * @author Cristian
 */
public interface Model {
    public List<Item> readAll();
    public boolean logUser(String name, String password);
    public Userlogin getUserlogin(String name);
    public Supplier getSupplier(String name);

    public boolean updateItem(Item item);
    public boolean saveItem(Item item);
}
