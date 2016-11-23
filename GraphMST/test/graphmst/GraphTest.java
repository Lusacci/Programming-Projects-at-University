/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphmst;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author James
 */
public class GraphTest {
    
    public GraphTest() {
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
     * Test of insertEdge method, of class Graph.
     */
    @Test
    public void testInsertEdge() {
        System.out.println("insertEdge");
        boolean list = false;
        int start = 0;
        int end = 0;
        int cost = 0;
        Graph instance = null;
        instance.insertEdge(start, end, cost);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
