
import business.DBUtil;
import business.User;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bento
 */
public class UserDB {
    public static void insert(User user){
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        EntityTransaction trans = em.getTransaction();
        trans.begin();
        try{
            em.persist(user);
            trans.commit();       
        }
        catch(Exception e){
            System.out.println(e);
            trans.rollback();
        }
        finally{
            em.close();
        }
        
    }
    
}
