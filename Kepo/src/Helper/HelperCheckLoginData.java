/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helper;

import Model.User;

/**
 *
 * @author Ishaq Fakhrozi
 */
public class HelperCheckLoginData {
    public void checkLoginData(final String Username, final String Password){

    boolean user, pass;

    if (Username.length() < 8){
        user = false;
    }else {
        user = true;
    }

    if (Password.length() < 8){
        pass = false;
    }else {
        pass = true;
    }
   

//    int val = 0;
//    if (user) val |= 0x1;
//    if (pass) val |= 0x2;
//
//    switch (val){
//    case 0:
//        User.loginFalse(get,"Username und Passwort müssen mindestens 6 Zeichen haben");
//
//    break;
//
//    case 1:
//        login.loginFalse(getApplicationContext(),"Passwort muss mindestens 6 Zeichen haben");
//    break;
//
//    case 2:
//        login.loginFalse(getApplicationContext(),"Username muss mindestens 6 Zeichen haben");
//    break;
//
//    case 3:
//        login.doLogin(getApplicationContext(),username, password);
//    }

}
}
