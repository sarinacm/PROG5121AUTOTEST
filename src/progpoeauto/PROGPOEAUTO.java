/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progpoeauto;

import javax.swing.JOptionPane;

/**
 *
 * @author ctill
 */
public class PROGPOEAUTO {

    Login loginUser = new Login();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        
        Login loginUser = new Login();

       String loginStatus = loginUser.loginUser("Mike", "123456");

       JOptionPane.showMessageDialog(null, loginStatus);
        
        
    }
    
}
