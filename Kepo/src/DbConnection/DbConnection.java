/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DbConnection;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Ishaq Fakhrozi
 */
public class DbConnection {
    public static EntityManager getConnection(){
       
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("KepoPU");
        EntityManager em = emf.createEntityManager();
    return em;
    }
}
