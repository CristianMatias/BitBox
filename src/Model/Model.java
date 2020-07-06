package Model;

import Model.Item.Item;
import Model.PriceReduction.Pricereduction;
import Model.Supplier.Supplier;
import Model.User.Userlogin;
import java.util.List;

/**
 *
 * @author Cristian
 */
public interface Model {
    /**
     * Get a List of Items from the database
     * @return - A List with all the items from the database
     */
    public List<Item> readAll();
    
    /**
     * Checks if the user's data is correct
     * @param name - user's name
     * @param password - user's password
     * @return - true if the information is correct, false otherwise
     */
    public boolean logUser(String name, String password);
    
    /**
     * Gets the user, searching by the name
     * @param name - the name that we are looking for
     * @return - The object with the information or null if is found none
     */
    public Userlogin getUserlogin(String name);
    
    /**
     * Gets the Supplier, searching by the name
     * @param name - the name that we are looking for
     * @return - The object with the information or null if is found none
     */
    public Supplier getSupplier(String name);

    /**
     * Updates the information of an existing item
     * @param item - the item with the new information
     * @return - true if the information is correct, false otherwise
     */
    public boolean updateItem(Item item);
    
    /**
     * Inserts a new item in the database
     * @param item - The new Item
     * @return - true if the information is correct, false otherwise
     */
    public boolean saveItem(Item item);

    /**
     * Inserts a new discount in the database
     * @param pricereduction - The object with the information of the discount
     * @return - true if the information is correct, false otherwise
     */
    public boolean createDiscount(Pricereduction pricereduction);
    
    /**
     * Removes an existing Item
     * @param item - The object with the Item information
     * @return - true if the information is correct, false otherwise
     */
    public boolean removeItem(Item item);
    
    /**
     * Gets all the users from the database
     * @return - A List with all the infromation of the users
     */
    public List<Userlogin> readUsers();
    
    /**
     * Remove an existing user of the database
     * @param userlogin - The object with the iformation that will be removed
     * @return - true if the information is correct, false otherwise
     */
    public boolean removeUsers(Userlogin userlogin);
    
    /**
     * Inserts a new User into the database
     * @param user - The new Object with the information
     * @return - true if the information is correct, false otherwise
     */
    public boolean saveUser(Userlogin user);
    
    /**
     * Gets a list of all the Suppliers
     * @return - The list with all the suppliers information
     */
    public List<Supplier> getAllSuppliers();
    
    /**
     * Updates the infromation of a current user
     * @param userlogin - The object with the new information
     * @return - true if the information is correct, false otherwise
     */
    public boolean updateUser(Userlogin userlogin);
    
    /**
     * Gets the cheapest item from each Supplier and add it into a list
     * @return - The list with the information
     */
    public List<Object[]> getCheapestItems();
    
    /**
     * A list of Suppliers that has offerts in his items
     * @return - A list with those Suppliers information
     */
    public List<Supplier> getSupplierWithOfferts();
}
