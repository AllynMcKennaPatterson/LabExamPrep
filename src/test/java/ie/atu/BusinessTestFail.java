package ie.atu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BusinessTestFail {
    @Test
    void testTitleFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, ()->{
            new Business("s", "Lackagh", 3453);
        });
        assertEquals("Name must have at least 3 characters", exMessage.getMessage());
    }

    @Test
    void testAddressFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, ()->{
            new Business("supavalu", "Lac", 3453);
        });
        assertEquals("Address must have at least 6 characters", exMessage.getMessage());
    }

    @Test
    void testIdFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, ()->{
            new Business("supavalu", "Lackagh", -3453);
        });
        assertEquals("Id must be positive", exMessage.getMessage());
    }
}
