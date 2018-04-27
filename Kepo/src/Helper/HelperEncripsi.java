/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helper;

import static java.awt.SystemColor.text;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import static javafx.scene.input.KeyCode.S;

/**
 *
 * @author Ishaq Fakhrozi
 */
public class HelperEncripsi {
    
 public static String getSha256(String value) {
    try{
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(value.getBytes());
        return bytesToHex(md.digest());
    } catch(Exception ex){
        throw new RuntimeException(ex);
    }
 }
 private static String bytesToHex(byte[] bytes) {
    StringBuffer result = new StringBuffer();
    for (byte b : bytes) result.append(Integer.toString((b & 0xff) + 0x100, 16).substring(1));
    return result.toString();
 }
}
