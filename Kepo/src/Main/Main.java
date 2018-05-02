/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import DAO.AnswerDAO;
import DAO.QuestionDAO;
import DAO.UserDAO;
import DAOimpl.AnswerDAOimpl;
import DAOimpl.QuestionDAOimpl;
import DAOimpl.UserDAOimpl;
import Model.Answer;
import Model.Question;
import Model.User;

/**
 *
 * @author Ishaq Fakhrozi
 */
public class Main {
    public static void main(String[] args){
//        UserDAO usdo = new UserDAOimpl();
//        QuestionDAO qdao = new QuestionDAOimpl();
//        AnswerDAO adao = new AnswerDAOimpl();
//        
//        
//        User u = new User();
//        Question q = new Question();
//        Answer a = new Answer();
//        
//       
//        u.setNama("ojik");
//        u.setPassword("123456");
//        u.setEmail("ojik@gmail.com");
//        u.setUsername("ojik12");
//        usdo.insert(u);

        System.out.println("getLogin");
        String Username="ojik12";
        String Password="123456";
        UserDAOimpl instance = new UserDAOimpl();
        User result = instance.getLogin(Username,Password);
        
        System.out.println(result.getId()); 
        
         // Tambah clap di user
//        Answer a = adao.getById(1);
//        Question q = qdao.getById(1);
//        User u = usdo.getById(1);
//        u.setRating(a.getClapAnswer()+q.getClapQuestion());
//        usdo.tambahclap(u);
        
    }
    
}
