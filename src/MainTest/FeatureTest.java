package MainTest;

import Main.Compass;
import Main.Feature;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class FeatureTest {
    @Test
    public void checkConstructor(){
        Feature test = new Feature();

        assertNotNull(test,"Feature null");
        assertNotNull(test.getName(),"Feature name null");
        assertNotNull(test.getLocation(),"Feature location null");
    }

}
