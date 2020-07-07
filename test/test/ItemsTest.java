/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import Model.Item.Item;
import Model.Item.ItemQueryImpl;
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
public class ItemsTest {
    
    public ItemsTest() {
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
        Item item = new Item();
        item.setCode(45668);
        
        assertTrue(new ItemQueryImpl().insert(item));
    }
    
    @Test
    public void deleteTest(){
        Item item = new Item();
        item.setCode(45668);
        
        assertTrue(new ItemQueryImpl().delete(item));
    }
    
    @Test
    public void updateTest(){
        Item item = new Item();
        item.setCode(45668);
        
        assertTrue(new ItemQueryImpl().update(item));
    }
}
