/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Question;
import java.util.List;

/**
 *
 * @author Ishaq Fakhrozi
 */
public interface QuestionDAO extends GeneralDAO {
    public Question getById(long id);
    public List<Question> getByAll();
}
