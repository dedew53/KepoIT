/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Answer;
import Model.User;
import java.util.List;

/**
 *
 * @author Ishaq Fakhrozi
 */
public interface AnswerDAO extends GeneralDAO{
    public Answer getById(long id);
    public List<Answer> getByAll();
    public void tambahClap(User u,Answer a);
}
