package Control;

import Model.Item.Item;
import Model.Model;
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
    
    
}
