package Main;

import com.sun.javafx.geom.Vec2d;

public class Player {
    private String name;
    private Vec2d playerLocation;
    private Compass compass;
    private int moveAmount = 5;


    public Player(String name) {
        this.name = name;
        playerLocation = new Vec2d(50,50);
        compass = new Compass();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vec2d getPlayerLocation() {
        return playerLocation;
    }

    public void setPlayerLocation(Vec2d playerLocation) {
        this.playerLocation = playerLocation;
    }

    public void move(String direction){

        switch (direction.toLowerCase()){
            case "north": playerLocation.x += moveAmount;
                         break;
            case "south": playerLocation.x -= moveAmount;
                break;
            case "east": playerLocation.y += moveAmount;
                break;
            case "west": playerLocation.y -= moveAmount;
                break;
        }
    }

    public Compass getCompass() {
        return compass;
    }
//
//    public void setCompass(Compass compass) {
//        this.compass = compass;
//    }
}
