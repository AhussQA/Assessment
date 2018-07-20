package Main;

import com.sun.javafx.geom.Vec2d;

public class Feature implements Interact {
    String name;
    public Vec2d location = new Vec2d();

    public Feature() {
        name = "Special Feature "+(int)(Math.random()*100)%100;
        location.set((int)(Math.random()*100)%100,(int)(Math.random()*100)%100);

    }
    public Feature(Vec2d location) {
        name = "Special Feature "+(int)(Math.random()*100)%100;
        this.location = location;

    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return name;
    }

    public Vec2d getLocation() {
        return location;
    }

    @Override
    public String OnTouch() {
        return "Nothing happens";
    }

    @Override
    public String OnKick() {
        return "You hurt your foot. Haha idiot";
    }

    @Override
    public String OnOpen() {
        return "You try to find a way to open it, but fail";
    }
}
