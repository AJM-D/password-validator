package com.example.acme.csci3130_demo;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
/**
 * Created by AJ on 2/6/2018.
 */

public class Validator {

    /**
     * This method checks if the password given is not password
     * and at least eight characters long
     */
    private MainActivity ma;

    @Before
    public void make(){
        ma = new MainActivity();
    }

    @Test
    public void notPassword() throws Exception{
        assertTrue(ma.notPassword("password1"));

    }
    @Test
    public void atleastEight() throws Exception{
        assertTrue(ma.atleastEight("mantolino"));
    }

}