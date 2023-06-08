package com.mycompany.app;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;


public class AppTest {
    public AppTest() {
    }

    @Test
    public void testApp() {
        assertTrue(true);
    }

    @Test
    public void testMore() {
        assertTrue(true);
    }

    @Test
    public void testLoop() {
        App app = new App();
        int expectedOutput = 10;
        int result = app.loop();
        System.out.println("****** result = " + result);
        assertEquals(expectedOutput, result);
    }
}
