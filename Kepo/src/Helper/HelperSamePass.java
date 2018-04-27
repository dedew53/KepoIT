/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helper;

/**
 *
 * @author Ishaq Fakhrozi
 */
public class HelperSamePass {
    public static boolean getSamePassword(String Password, String repassword){
        return Password.equals(repassword);
    }
}
