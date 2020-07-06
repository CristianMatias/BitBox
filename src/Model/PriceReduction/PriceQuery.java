package Model.PriceReduction;

import Model.GenericQuery;

/**
 *
 * @author Cristian
 */
public interface PriceQuery extends GenericQuery<Pricereduction>{
    String HQL_MAX_INDEX = "select max(p.idReduction) from Pricereduction p";
    /**
     * Gets the max index of all the items
     * @return - the int with the index value
     */
    public int getMaxIndex();
}
