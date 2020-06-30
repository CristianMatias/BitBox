package Model.Supplier;

import Model.Conexion;
import java.io.Serializable;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class SupplierQueryImpl implements SupplierQuery {
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
    public List<Supplier> readAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Supplier readOne(Serializable id, Class<Supplier> entityClass) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean insert(Supplier object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Supplier object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean create(Supplier object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void closeSession() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Supplier getSupplier(String name) {
        query = getSession().createQuery("from Supplier WHERE name = :name");
        query.setString("name", name);
        return (Supplier) query.setMaxResults(1).uniqueResult();
    }

    @Override
    public boolean delete(Supplier object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
