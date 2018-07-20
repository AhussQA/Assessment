package Main;

import java.util.LinkedList;
import java.util.List;

public class GameWorld {
    private List<Feature> features;
    private Player player;
    private int nFeatures = 15;

    public GameWorld(){
        features = new LinkedList<Feature>();
        //creates features of three different types. the differentiating attribute is the name has the type of object it is added to the string

        for (int i = 0; i <nFeatures ; i+=3) {
            Feature f = new Feature();
            features.add(f);
        }
        for (int i = 1; i <nFeatures ; i+=3) {
            Feature f = new AncientMonolith();
            features.add(f);
        }
        for (int i = 2; i <nFeatures ; i+=3) {
            Feature f = new Wreckage();
            features.add(f);
        }

    }
    public List<Feature> getFeatures() {
        return features;
    }

//    public Player getPlayer() {
//        return player;
//    }
    public void setPlayer(Player player){
        this.player = player;
    }
}
