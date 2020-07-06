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

    /**
     * Constructor
     * @param model - Model that the application
     * will be using, can't be null
     */
    public ControlImpl(Model model) {
        this.model = model;
    }

    /**
     * Method that checks if the user and
     * password are correct
     * @param name - user's name
     * @param password - user's password
     * @return - true if the information is correct
     * false otherwise
     */
    @Override
    public boolean logUser(String name, String password) {
        return model.logUser(name, password);
    }

    /**
     * Gets all the Items
     * in the database
     * @return - A list with all
     * the items
     */
    @Override
    public List readItems() {
        return model.readAll();
    }
    
    /**
     * Get a Supplier by the name
     * @param name - name of the
     * Supplier we are looking for
     * @return - The object Supplier or a
     * null if there is no Supplier
     */
    @Override
    public Supplier getSupplier(String name) {
        return model.getSupplier(name);
    }

    /**
     * Gets the information of a user
     * looking by the name
     * @param name - name of the user we are looking for
     * @return - An object with the information or a null
     */
    @Override
    public Userlogin getUserlogin(String name) {
        return model.getUserlogin(name);
    }

    /**
     * Updates an item
     * @param item - The item with the new infromation
     * @return - true if everything was correct, false otherwise
     */
    @Override
    public boolean updateItem(Item item) {
        return model.updateItem(item);
    }

    /**
     * Registrer a new Item in the database
     * @param item - The new Item
     * @return - true if everything was correct, false otherwise
     */
    @Override
    public boolean createItem(Item item) {
        return model.saveItem(item);
    }

    /**
     * Creates a new discount
     * @param pricereduction - the object with the discount information
     * @return - true if everything was correct, false otherwise
     */
    @Override
    public boolean createDiscount(Pricereduction pricereduction) {
        return model.createDiscount(pricereduction);
    }

    /**
     * Deletes the item that has in paramethers
     * @param item - The item that wants to delete
     * @return - true if everything was correct, false otherwise
     */
    @Override
    public boolean deleteItem(Item item) {
        return model.removeItem(item);
    }

    /**
     * Gets a list with all the users
     * @return - The list with the information
     */
    @Override
    public List readUsers() {
        return model.readUsers();
    }

    /**
     * Deletes the user
     * @param userlogin - The object with the information that is need to delete
     * @return - true if everything was correct, false otherwise
     */
    @Override
    public boolean deleteUser(Userlogin userlogin) {
        return model.removeUsers(userlogin);
    }

    /**
     * Inserts a new user 
     * @param userlogin - The new user
     * @return - true if everything was correct, false otherwise
     */
    @Override
    public boolean saveUser(Userlogin userlogin) {
        return model.saveUser(userlogin);
    }

    /**
     * Gets all the suppliers from the database
     * @return - A list with the objects with the information
     */
    @Override
    public List readSuppliers() {
        return model.getAllSuppliers();
    }

    /**
     * Updates the user
     * @param userlogin - the object with the new information of the user
     * @return - true if everything was correct, false otherwise
     */
    @Override
    public boolean updateUser(Userlogin userlogin) {
        return model.updateUser(userlogin);
    }

    /**
     * Gets the cheapest item per supplier
     * @return - The list with the items and Suppliers
     */
    @Override
    public List getCheapestItems() {
        return model.getCheapestItems();
    }

    /**
     * Gets a list with the Suppliers that has Items with discount
     * @return - The list with the Suppliers
     */
    @Override
    public List getSupplierWithOfferts() {
        return model.getSupplierWithOfferts();
    }
    
    
}
