package Model.User;

import Model.GenericQuery;

/**
 *
 * @author Cristian
 */
public interface UserQuery extends GenericQuery<Userlogin>{
    String HQL_CHECK_USER = "from Userlogin WHERE userName = :name AND pass = :pass";
    public boolean checkUser(String name, String pass);
}
