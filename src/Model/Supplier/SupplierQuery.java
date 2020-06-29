package Model.Supplier;

import Model.GenericQuery;

/**
 *
 * @author Cristian
 */
public interface SupplierQuery extends GenericQuery<Supplier>{
    public Supplier getSupplier(String name);
}
