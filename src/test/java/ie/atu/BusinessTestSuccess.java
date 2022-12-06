package ie.atu;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BusinessTestSuccess {
    private Business myBusiness;

    @BeforeEach
    void setUp(){
        myBusiness = new Business("Supavalu", "Lackagh", 124);
    }

    @Test
    void testName(){
        assertEquals("Supavalu", myBusiness.getName());
    }

    @Test
    void testAddress(){
        assertEquals("Lackagh", myBusiness.getAddress());
    }

    @Test
    void testId(){
        assertEquals(124, myBusiness.getId());
    }
}
