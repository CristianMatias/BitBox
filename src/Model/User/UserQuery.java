package Model.User;

import Model.GenericQuery;

/**
 *
 * @author Cristian
 */
public interface UserQuery extends GenericQuery<Userlogin>{
    String HQL_CHECK_USER = "from Userlogin WHERE userName = :name";
    
    /**
     * Checks if the user's data is correct
     * @param name - user's name
     * @param pass - user's password
     * @return - true if the information is correct, false otherwise
     */
    public boolean checkUser(String name, String pass);
    
    /**
     * Gets the user, searching by the name
     * @param name - the name that we are looking for
     * @return - The object with the information or null if is found none
     */
    public Userlogin getUserlogin(String name);
}
