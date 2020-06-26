package Model.User;

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
public class UserQueryImpl implements UserQuery{
    private Transaction transaccion;
    private Query query;
    private Session session = null;

    @Override
    public boolean checkUser(String name, String pass) {
        try{
            query = getSession().createQuery(HQL_CHECK_USER);
            query.setString("name", name);
            query.setString("pass", pass);
        }catch(Exception ex){
            ex.printStackTrace();
            return false;
        }
        return true;
    }

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
    public List<Userlogin> readAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Userlogin readOne(Serializable id, Class<Userlogin> entityClass) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean insert(Userlogin object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Userlogin object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean create(Userlogin object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void closeSession() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
   
    
}
