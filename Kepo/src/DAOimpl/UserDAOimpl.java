/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOimpl;

import DAO.UserDAO;
import Model.User;
import java.util.List;

/**
 *
 * @author Ishaq Fakhrozi
 */
public class UserDAOimpl extends GeneralDAOimpl implements UserDAO {
    
     public UserDAOimpl(){
        super();
    }

    @Override
    public List<User> getByAll() {
        return em.createQuery("from User u").getResultList();
    }

    @Override
    public User getById(long id) {
        return em.find(User.class,id);
    }

    @Override
    public User getLogin(String Username, String Password) {
        User tes=null;
       try{
           tes=(User)em.createQuery("select u from User u where u.Username=?1 and u.Password=?2")
                   .setParameter(1, Username).setParameter(2, Password).getSingleResult();
       }catch(Exception ex){
           
       }
       return tes;
    }

    @Override
    public List<User> getEmailValid(String Email) {
        return em.createQuery("select Email from User").getResultList();
    }
}
