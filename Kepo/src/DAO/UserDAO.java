/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.User;
import java.util.List;

/**
 *
 * @author Ishaq Fakhrozi
 */
public interface UserDAO extends GeneralDAO {
    public User getById(long id);
    public List<User> getByAll();
    public User getLogin(String Username, String Password);
    public List<User> getEmailValid(String Email);
}
