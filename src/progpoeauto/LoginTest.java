/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progpoeauto;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ctill
 */
public class LoginTest {
    
    Login loginTest = new Login();
    
    public LoginTest() {
    }

    @Test
    public void testLoginUser() 
    {
        String expected = loginTest.loginSuccess;
        String actual =  loginTest.loginUser("Mike", "123456");
    }
    
}
