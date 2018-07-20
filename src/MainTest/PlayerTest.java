package MainTest;

import Main.Player;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {
    @Test
    public void checkConstructor(){
        Player test = new Player("String");
        assertSame("String",test.getName(),"Wrong name");
        assertNotNull(test.getPlayerLocation(),"Location null");
        assertNotNull(test.getCompass(),"Compass null");
    }
}
