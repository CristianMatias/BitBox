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
    
    public Supplier getSupplier(String name);
    public List<Object[]> getCheapestItems();
    public List<Supplier> getSupplierWithOfferts();
}
