package Main;

import com.sun.javafx.geom.Vec2d;

import java.util.List;

public class Compass {

    public Feature getNearestFeature(Vec2d playerLocation, List<Feature> featureList, boolean delete) {
        Feature currentNearestFeature = featureList.get(0);
        double currentNearestDistance = 10000000;
        for (Feature f : featureList) {

            double distance = (double) playerLocation.distance(f.location);
            if (distance < currentNearestDistance) {
                currentNearestDistance = distance;
                currentNearestFeature = f;
            }

        }
        if(delete) {
            featureList.remove(currentNearestFeature);
        }
        return currentNearestFeature;
    }

    public double getNearestFeatureDistance(Vec2d playerLocation, List<Feature> featureList, boolean delete) {

        double currentNearestDistance = 10000000;
        for (Feature f : featureList) {
//            double x,y;
//            x = Math.abs(playerLocation.x - f.getLocation().x);
//            y = Math.abs(playerLocation.x - f.getLocation().x);
//            int distance = (int)Math.sqrt(x*x+y*y);
//            System.out.println(playerLocation+"    ::::    "+f.getLocation());
            double distance = (double) playerLocation.distance(f.location);
            if (distance < currentNearestDistance) {
                currentNearestDistance = distance;

            }

        }
        return currentNearestDistance;
    }
}
