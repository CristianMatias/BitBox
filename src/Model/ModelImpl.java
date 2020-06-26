package Model;

import Model.Item.Item;
import Model.Item.ItemQuery;
import Model.Item.ItemQueryImpl;
import Model.User.UserQuery;
import Model.User.UserQueryImpl;
import java.util.List;

/**
 * 
 * @author Cristian
 */
public class ModelImpl implements Model {
    private final ItemQuery itemQuery;
    private final UserQuery userQuery;

    public ModelImpl() {
        this.itemQuery = new ItemQueryImpl();
        this.userQuery = new UserQueryImpl();
    }

    @Override
    public List<Item> readAll() {
        return itemQuery.readAll();
    }

    @Override
    public boolean logUser(String name, String password) {
        return userQuery.checkUser(name, password);
    }
    
}
