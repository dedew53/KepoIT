/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOimpl;

import Model.User;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ishaq Fakhrozi
 */
public class UserDAOimplTest {
    
    public UserDAOimplTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getByAll method, of class UserDAOimpl.
     */
//    @Test
//    public void testGetByAll() {
//        System.out.println("getByAll");
//        UserDAOimpl instance = new UserDAOimpl();
//        List<User> expResult = null;
//        List<User> result = instance.getByAll();
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
//    }

//    /**
//     * Test of getById method, of class UserDAOimpl.
//     */
//    @Test
//    public void testGetById() {
//        System.out.println("getById");
//        long id = 0L;
//        UserDAOimpl instance = new UserDAOimpl();
//        Pengguna expResult = null;
//        Pengguna result = instance.getById(id);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of getLogin method, of class UserDAOimpl.
     */

    
//     @Test
//    public void TestgetLogin() throws NoSuchAlgorithmException {        
//    System.out.println("getLogin");
//        String username="ojik12";
//        String password="1234567";
//        UserDAOimpl instance = new UserDAOimpl();
//        Pengguna result = null;
//        boolean exist = instance.getExistUsername(username);
//        if(exist==true){
//            result=instance.getLogin(username, password);
//            if (result==null){
//                fail("password salah");
//            }
//            assertNotNull(result);
//        }else{
//            fail("username tidak ada");
//        }
//        
//       
//   } 
//    registrasi cek username sudah ada 
//    @Test
//        public void testRegistrasi(){
//        String username = "ojik12";
//        String password = HelperEncripsi.getSha256("123456");
//        String repassword= HelperEncripsi.getSha256("123456");
//        String Email = "ojik2@gmail.com";
//        boolean sama = HelperSamePass.getSamePassword(password,repassword);
//        assertTrue(sama);
//       
//        
//        UserDAO udo = new UserDAOimpl();
//        Pengguna u= new Pengguna();
//        u.setNama(username);
//        u.setPassword(HelperEncripsi.getSha256(password));
//        u.setEmail(Email);
//        boolean exist = udo.getExistUsername(username);
//        
//        if(exist==false){
//            udo.insert(u);
//            List<Pengguna> listuser = udo.getByAll();
//            Pengguna expectResult = new Pengguna();
//            for (Pengguna result : listuser){
//                if(u.getUsername()== result.getUsername()){
//                expectResult=result;
//                break;
//                }
//            }
//                assertSame(expectResult,u);
//            
//        }else{
//            fail("username sudah ada");
//        }
//      }
        
    
    //change password
//    @Test
//    public void ubahPass() throws NoSuchAlgorithmException{
//        long id =1L;
//        String password = "1234567";
//        String repassword = "1234568";
//        boolean sama = HelperSamePass.getSamePassword(password,repassword);
//        if (sama==false){
//            fail("password dan repassword tidak sama");
//            
//        }else{
//            UserDAO udo= new UserDAOimpl();
//            Pengguna u =udo.getById(id);
//            u.setPassword(password);
//            udo.update(u);
//            List<User> listuser= udo.getByAll();
//            Pengguna expectResult= new Pengguna();
//            for (Pengguna result : listuser){
//                if(u.getPassword()== result.getPassword()){
//                    expectResult=result;
//                    break;
//                }
//            }
//            assertSame("password berubah",expectResult,u);
//        }
//        
//    }

    
}
