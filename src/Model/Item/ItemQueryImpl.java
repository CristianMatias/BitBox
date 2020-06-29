package Model.Item;

import Model.Conexion;
import java.io.Serializable;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * 
 * @author Cristian
 */
public class ItemQueryImpl implements ItemQuery {
    private Transaction transaccion;
    private Query query;
    private Session session = null;
    
    @Override
    public Session getSession() {
        if(session == null || !session.isOpen()) 
            session = Conexion.getSessionFactory().openSession();
        
        return session;
    }

    @Override
    public void startTransaction() {
        transaccion = getSession().beginTransaction();
    }

    @Override
    public void endTransaction() {
        try{
            if(!transaccion.wasCommitted())
            transaccion.commit();
        }catch(HibernateException ex){
            transaccion.rollback();
            handleException(ex);
        }finally{
            closeSession();
        }
    }

    @Override
    public void handleException(HibernateException ex) {
        ex.printStackTrace();
    }

    @Override
    public List<Item> readAll() {
        query = getSession().createQuery(HQL_READ_ALL);
        return query.list();
    }

    @Override
    public Item readOne(Serializable id, Class<Item> entityClass) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean insert(Item object) {
        try{
            startTransaction();
            object.setCode(getMaxCode()+1);
            getSession().persist(object);
            endTransaction();
            return true;
        }catch(Exception ex){
            ex.printStackTrace();
            return false;
        }
    }
    
    private int getMaxCode(){
        query = getSession().createQuery("select max(i.code) from Item i");
        return (int) query.setMaxResults(1).uniqueResult();
    }

    @Override
    public boolean update(Item object) {
        try{
            startTransaction();
            getSession().update(object);
            endTransaction();
            return true;
        }catch(Exception ex){
            return false;
        }
    }

    @Override
    public boolean create(Item object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void closeSession() {
        session.close();
    }
    
}
