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
   public Session getSession();
   public void startTransaction();
   public void endTransaction();
   public void handleException(HibernateException ex);
   public List<E> readAll();
   public E readOne(Serializable id, Class<E> entityClass);
   public boolean insert(E object);
   public boolean update(E object);
   public boolean create(E object);
   public boolean delete(E object);
   public void closeSession();
}
