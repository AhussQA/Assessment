package MainTest;

import Main.Compass;
import Main.GameWorld;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GameWorldTest {

    @Test
    public void checkConstructor(){
        GameWorld test = new GameWorld();


        assertNotNull(test,"GameWorld null");
        assertNotNull(test.getFeatures(),"GameWorld null");

    }
}
