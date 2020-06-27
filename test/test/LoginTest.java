/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import Model.User.UserQueryImpl;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Cristian
 */
public class LoginTest {
    
    public LoginTest() {
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

    @Test
    public void correctLogin(){
        String username = "Admin";
        String password = "12345";
        assertTrue(new UserQueryImpl().checkUser(username, password));
    }
    
    @Test
    public void failedLoginPass(){
        String username = "Admin";
        String password = "fail";
        assertTrue(new UserQueryImpl().checkUser(username, password));
    }
    
    @Test
    public void failedLoginName(){
        String username = "Admin2";
        String password = "12345";
        assertTrue(new UserQueryImpl().checkUser(username, password));
    }
}
