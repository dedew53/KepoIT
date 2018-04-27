/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOimpl;

import DAO.AnswerDAO;
import Model.Answer;
import Model.User;
import java.util.List;

/**
 *
 * @author Ishaq Fakhrozi
 */
public class AnswerDAOimpl extends GeneralDAOimpl implements AnswerDAO{
    public AnswerDAOimpl(){
        super();
    }

    @Override
    public Answer getById(long id) {
        return em.find(Answer.class,id);
    }

    @Override
    public List<Answer> getByAll() {
        return em.createQuery("from Answer a").getResultList();
    }

    @Override
    public void tambahClap(User u, Answer a) {
           try{
            em.getTransaction().begin();
            em.persist(u);
            em.merge(a);
            em.getTransaction().commit();
        }catch(Exception ex){
            em.getTransaction().rollback();
    }
 }
}
