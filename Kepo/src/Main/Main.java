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
import Helper.HelperEncripsi;
import Model.Answer;
import Model.Question;
import Model.Pengguna;
import java.util.Date;

/**
 *
 * @author Ishaq Fakhrozi
 */
public class Main {
    public static void main(String[] args){
        UserDAO usdo = new UserDAOimpl();
        QuestionDAO qdao = new QuestionDAOimpl();
        AnswerDAO adao = new AnswerDAOimpl();
        
        
//        Pengguna u = new Pengguna();
//        Question q = new Question();
//        Answer a = new Answer();
        
          // Insert Register
//        u.setNama("ishaq fakhrozi");
//        u.setPassword(HelperEncripsi.getSha256("123456"));
//        u.setEmail("Ojik2@gmail.com");
//        u.setUsername("ojik123");
//        usdo.insert(u);

        //Insert Question
//        Pengguna us = usdo.getById(1);
//        q.setClapQuestion(10);
//        q.setPosting("Ojik ganteng sekali");
//        q.setTitle("bagus");
//        q.setTglQuestion(new Date());
//        q.setUser(us);
//        qdao.insert(q);

          //Insert Answer
//          Pengguna us= usdo.getById(1);
//          Question qu = qdao.getById(1);
//          a.setClapAnswer(15);
//          a.setPostKoment("Keren");
//          a.setTglAnswer(new Date());
//          a.setUser(us);
//          a.setQuestion(qu);
//          adao.insert(a);

        // Tambah clap di user
//        Answer a = adao.getById(1);
//        Question q = qdao.getById(1);
//        Pengguna u = usdo.getById(1);
//        u.setRating(a.getClapAnswer()+q.getClapQuestion());
//        usdo.tambahclap(u);



 
 

        
        
    }
}

