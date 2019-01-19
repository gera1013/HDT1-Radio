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
 * @author Gerardo Mendez
 * @author Luis Pedro Cuellar
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
     * Test para el metodo subirFrecuencia
     * Prueba si el avance de frecuencia funciona de manera correcta
     */
    @Test
    public void testSubirFrecuencia() {
        System.out.println("subirFrecuencia");
        myRadio instance = new myRadio();
        double expResult = 88.10000000000001;
        double result = instance.subirFrecuencia();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test para el metodo bajarFrecuencia
     * Prueba si el retroceso de frecuencia funciona de manera correcta
     */
    @Test
    public void testBajarFrecuencia() {
        System.out.println("bajarFrecuencia");
        myRadio instance = new myRadio();
        double expResult = 107.9;
        double result = instance.bajarFrecuencia();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test para getFavorito 
     * Prueba si las emisoras almacenadas en el array son extraidas de manera correcta
     */
    @Test
    public void testGetFavorito() {
        System.out.println("getFavorito");
        int boton = 3;
        myRadio instance = new myRadio();
        double expResult = 90.5;
        double result = instance.getFavorito(boton);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test para el metodo cambiarAmFm 
     */
    @Test
    public void testCambiarAmFm() {
        System.out.println("cambiarAmFm");
        myRadio instance = new myRadio();
        boolean expResult = false;
        boolean result = instance.cambiarAmFm();
        assertEquals(expResult, result);
    }
    
}
