package Model.Item;

import Model.GenericQuery;

/**
 *
 * @author Cristian
 */
public interface ItemQuery extends GenericQuery<Item>{
    String HQL_READ_ALL = "from Item";
}
