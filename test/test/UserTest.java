/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import Model.User.UserQueryImpl;
import Model.User.Userlogin;
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
public class UserTest {
    
    public UserTest() {
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
    public void insertTest(){
        Userlogin user = new Userlogin();
        user.setUsername("example");
        user.setPass("asdfg");
        
        assertTrue(new UserQueryImpl().insert(user));
                
    }
    
    @Test
    public void deleteTest(){
        Userlogin user = new Userlogin();
        user.setUsername("example");
        user.setPass("asdfg");
        
        assertTrue(new UserQueryImpl().delete(user));
                
    }
    
    @Test
    public void updateTest(){
        Userlogin user = new Userlogin();
        user.setUsername("example");
        user.setPass("asdfg");
        
        assertTrue(new UserQueryImpl().update(user));
                
    }
}
