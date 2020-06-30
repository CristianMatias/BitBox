package Model.PriceReduction;

import Model.GenericQuery;

/**
 *
 * @author Cristian
 */
public interface PriceQuery extends GenericQuery<Pricereduction>{
    String HQL_MAX_INDEX = "select max(p.idReduction) from Pricereduction p";
    public int getMaxIndex();
}
