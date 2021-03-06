package Control;

import Model.Item.Item;
import Model.PriceReduction.Pricereduction;
import Model.Supplier.Supplier;
import Model.User.Userlogin;
import java.util.List;

/**
 *
 * @author Cristian
 */
public interface Control {
    public boolean logUser(String name, String password);
    public List readItems();
    public Supplier getSupplier(String name);
    public Userlogin getUserlogin(String name);
    public boolean updateItem(Item item);
    public boolean createItem(Item item);
    public boolean createDiscount(Pricereduction pricereduction);
    public boolean deleteItem(Item item);
    public List readUsers();
    public boolean deleteUser(Userlogin userlogin);
    public boolean saveUser(Userlogin userlogin);
    public List readSuppliers();
    public boolean updateUser(Userlogin userlogin);
    public List<Object[]> getCheapestItems();
    public List getSupplierWithOfferts();
}
