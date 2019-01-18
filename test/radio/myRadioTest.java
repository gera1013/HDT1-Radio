/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radio;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Gerardo
 */
public class myRadioTest {
    
    public myRadioTest() {
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
     * Test of subirFrecuencia method, of class myRadio.
     */
    @Test
    public void testSubirFrecuencia() {
        System.out.println("subirFrecuencia");
        myRadio instance = new myRadio();
        double expResult = 88.10000000000001;
        double result = instance.subirFrecuencia();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println(expResult + " " + result);
    }

    /**
     * Test of bajarFrecuencia method, of class myRadio.
     */
    @Test
    public void testBajarFrecuencia() {
        System.out.println("bajarFrecuencia");
        myRadio instance = new myRadio();
        double expResult = 107.9;
        double result = instance.bajarFrecuencia();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println(expResult + " " + result);
    }

    /**
     * Test of getFavorito method, of class myRadio.
     */
    @Test
    public void testGetFavorito() {
        System.out.println("getFavorito");
        int posicion = 0;
        myRadio instance = new myRadio();
        double expResult = 0.0;
        double result = instance.getFavorito(posicion);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cambiarAmFm method, of class myRadio.
     */
    @Test
    public void testCambiarAmFm() {
        System.out.println("cambiarAmFm");
        myRadio instance = new myRadio();
        boolean expResult = false;
        boolean result = instance.cambiarAmFm();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFavorito method, of class myRadio.
     */
    @Test
    public void testSetFavorito() {
        System.out.println("setFavorito");
        double frecuencia = 0.0;
        int posicion = 0;
        myRadio instance = new myRadio();
        instance.setFavorito(frecuencia, posicion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
