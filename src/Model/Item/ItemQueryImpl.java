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
        transaccion = getSession().getTransaction();
    }

    @Override
    public void endTransaction() {
        try{
            transaccion.commit();
        }catch(HibernateException ex){
            handleException(ex);
        }finally{
            closeSession();
        }
    }

    @Override
    public void handleException(HibernateException ex) {
        transaccion.rollback();
        JOptionPane.showConfirmDialog(null, null, "ERROR", JOptionPane.ERROR_MESSAGE);
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Item object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean create(Item object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void closeSession() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
