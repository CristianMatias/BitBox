package Model;

import java.io.Serializable;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author Cristian
 * @param <E>
 */
public interface GenericQuery<E>{
   /**
    * Gets the current Session, if is closed, opens a new one first
    * @return - The current session
    */
   public Session getSession();
   
   /**
    * Prepares the transaction
    */
   public void startTransaction();
   
   /**
    * Ends the current transaction, with a commit if everything
    * is correct or with a rollback otherwise
    */
   public void endTransaction();
   
   /**
    * If an exception happens, this method advert the user
    * @param ex - The exeption that happend
    */
   public void handleException(HibernateException ex);
   
   /**
    * Return a list of the object E, E will be replaced
    * with a diferent object. For example, it can be a list
    * of Item, in that case E will be replaced with Item
    * @return - The list with the objects
    */
   public List<E> readAll();
   
   /**
    * Read one of the type object of E, E will be replaced
    * with a diferent object. For example, it can be a list
    * of Item, in that case E will be replaced with Item
    * @param id - The id of the object that the user is looking for
    * @param entityClass - The Class of the Object
    * @return - The object with the information or null, if the search failed
    */
   public E readOne(Serializable id, Class<E> entityClass);
   
   /**
    * Inserts a new object of type E, E will be replaced
    * with a diferent object. For example, it can be a list
    * of Item, in that case E will be replaced with Item
    * @param object - The new object with the information
    * @return - true if the operation was succesful, false otherwise
    */
   public boolean insert(E object);
   
   /**
    * Updates an existing object of type E, E will be replaced
    * with a diferent object. For example, it can be a list
    * of Item, in that case E will be replaced with Item
    * @param object - the object with the new information
    * @return - true if the operation was succesful, false otherwise
    */
   public boolean update(E object);
   
   /**
    * Adds a new object of type E, E will be replaced
    * with a diferent object. For example, it can be a list
    * of Item, in that case E will be replaced with Item
    * @param object - the object with the information
    * @return - true if the operation was succesful, false otherwise
    */
   public boolean create(E object);
   
   /**
    * Deletes an existing object of type E, E will be replaced
    * with a diferent object. For example, it can be a list
    * of Item, in that case E will be replaced with Item
    * @param object - the object that will be removed
    * @return - true if the operation was succesful, false otherwise
    */
   public boolean delete(E object);
   
   /**
    * Close the current session
    */
   public void closeSession();
}
