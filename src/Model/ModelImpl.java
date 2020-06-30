package Model;

import Model.Item.Item;
import Model.Item.ItemQuery;
import Model.Item.ItemQueryImpl;
import Model.PriceReduction.PriceQuery;
import Model.PriceReduction.PriceQueryImpl;
import Model.PriceReduction.Pricereduction;
import Model.Supplier.Supplier;
import Model.Supplier.SupplierQuery;
import Model.Supplier.SupplierQueryImpl;
import Model.User.UserQuery;
import Model.User.UserQueryImpl;
import Model.User.Userlogin;
import java.util.List;

/**
 * 
 * @author Cristian
 */
public class ModelImpl implements Model {
    private final ItemQuery itemQuery;
    private final UserQuery userQuery;
    private final SupplierQuery supplierQuery;
    private final PriceQuery priceQuery;

    public ModelImpl() {
        this.itemQuery = new ItemQueryImpl();
        this.userQuery = new UserQueryImpl();
        this.supplierQuery = new SupplierQueryImpl();
        this.priceQuery = new PriceQueryImpl();
    }

    @Override
    public List<Item> readAll() {
        return itemQuery.readAll();
    }

    @Override
    public boolean logUser(String name, String password) {
        return userQuery.checkUser(name, password);
    }

    @Override
    public Supplier getSupplier(String name) {
        return supplierQuery.getSupplier(name);
    }

    @Override
    public Userlogin getUserlogin(String name) {
        return userQuery.getUserlogin(name);
    }

    @Override
    public boolean updateItem(Item item) {
        return itemQuery.update(item);
    }

    @Override
    public boolean saveItem(Item item) {
        return itemQuery.insert(item);
    }

    @Override
    public boolean createDiscount(Pricereduction pricereduction) {
        return priceQuery.insert(pricereduction);
    }

    @Override
    public boolean removeItem(Item item) {
        return itemQuery.delete(item);
    }
    
}
