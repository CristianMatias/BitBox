package Model.PriceReduction;

import Model.Conexion;
import java.io.Serializable;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class PriceQueryImpl implements PriceQuery {
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
    public int getMaxIndex() {
        query = getSession().createQuery(HQL_MAX_INDEX);
        return (int) query.setMaxResults(1).uniqueResult();
    }

    @Override
    public List<Pricereduction> readAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pricereduction readOne(Serializable id, Class<Pricereduction> entityClass) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean insert(Pricereduction object) {
        try{
            startTransaction();
            object.setIdReduction(getMaxIndex()+1);
            session.persist(object);
            endTransaction();
            return true;
        }catch(Exception ex){
            ex.printStackTrace();
            return false;
        }
        
    }

    @Override
    public boolean update(Pricereduction object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean create(Pricereduction object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void closeSession() {
        session.close();
    }

    @Override
    public boolean delete(Pricereduction object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
