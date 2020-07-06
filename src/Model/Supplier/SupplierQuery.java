package Model.Supplier;

import Model.GenericQuery;
import java.util.List;

/**
 *
 * @author Cristian
 */
public interface SupplierQuery extends GenericQuery<Supplier>{
    String HQL_CHEAPEST_ITEMS = "select s.name, i.description, i.price \n" +
        "from Supplier as s inner join Item as i on i.supplier_id = s.id\n" +
        "where i.price = (select min(price) from Item where supplier_id = s.id);";

    String HQL_SUPPLIERS_WITH_OFFERTS = "select s.name, s.country\n" +
        "from Supplier as s inner join Item as i on i.supplier_id = s.id\n" +
        "where i.reduction_id is not null\n" +
        "group by s.name, s.country";
    
    /**
     * Gets the Supplier looking for the name
     * @param name - the name of the Supplier the user is looking for
     * @return - the object with the Supplier infromation
     */
    public Supplier getSupplier(String name);
    
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
