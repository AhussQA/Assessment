package MainTest;

import Main.Compass;
import Main.Feature;
import Main.Player;
import com.sun.javafx.geom.Vec2d;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

public class CompassTest {
    @Test
    public void checkConstructor(){
        Compass test = new Compass();

        assertNotNull(test,"Compass null");
    }
    @Test
    public void testMethod(){
        Vec2d l1 = new Vec2d(1,2);
        Vec2d l2 = new Vec2d(4,4);
        Compass test = new Compass();


        List<Feature> featureList = new LinkedList<>();
        Feature f = new Feature(l1);
        Feature f1 = new Feature(l2);
        featureList.add(f);
        featureList.add(f1);

        assertSame(f,test.getNearestFeature(new Vec2d(0,0),featureList,false),"Wrong Feature");

        Vec2d testPlayerLocation = new Vec2d(0,0);
        assertEquals(testPlayerLocation.distance(l1),test.getNearestFeatureDistance(new Vec2d(0,0),featureList,false),"Wrong distance");
    }
}
