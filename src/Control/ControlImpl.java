package Control;

import Model.Item.Item;
import Model.Model;
import Model.PriceReduction.Pricereduction;
import Model.Supplier.Supplier;
import Model.User.Userlogin;
import java.util.List;

/**
 *
 * @author Cristian
 */
public class ControlImpl implements Control{
    private final Model model;

    public ControlImpl(Model model) {
        this.model = model;
    }

    @Override
    public boolean logUser(String name, String password) {
        return model.logUser(name, password);
    }

    @Override
    public List readItems() {
        return model.readAll();
    }

    @Override
    public Supplier getSupplier(String name) {
        return model.getSupplier(name);
    }

    @Override
    public Userlogin getUserlogin(String name) {
        return model.getUserlogin(name);
    }

    @Override
    public boolean updateItem(Item item) {
        return model.updateItem(item);
    }

    @Override
    public boolean createItem(Item item) {
        return model.saveItem(item);
    }

    @Override
    public boolean createDiscount(Pricereduction pricereduction) {
        return model.createDiscount(pricereduction);
    }

    @Override
    public boolean deleteItem(Item item) {
        return model.removeItem(item);
    }

    @Override
    public List readUsers() {
        return model.readUsers();
    }

    @Override
    public boolean deleteUser(Userlogin userlogin) {
        return model.removeUsers(userlogin);
    }

    @Override
    public boolean saveUser(Userlogin userlogin) {
        return model.saveUser(userlogin);
    }

    @Override
    public List readSuppliers() {
        return model.getAllSuppliers();
    }

    @Override
    public boolean updateUser(Userlogin userlogin) {
        return model.updateUser(userlogin);
    }

    @Override
    public List getCheapestItems() {
        return model.getCheapestItems();
    }

    @Override
    public List getSupplierWithOfferts() {
        return model.getSupplierWithOfferts();
    }
    
    
}
