/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOimpl;

import DAO.QuestionDAO;
import Model.Question;
import java.util.List;

/**
 *
 * @author Ishaq Fakhrozi
 */
public class QuestionDAOimpl extends GeneralDAOimpl implements QuestionDAO{
    public QuestionDAOimpl(){
        super();
    }

    @Override
    public Question getById(long id) {
        return em.find(Question.class,id);
    }

    @Override
    public List<Question> getByAll() {
        return em.createQuery("from Question q").getResultList();
    }
}
