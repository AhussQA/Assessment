package Main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static int gridXYSize = 100;
//    static Player player;
    public static void main(String[] args) {
        System.out.println("Enter your name and press Enter: ");
        Scanner scanner = new Scanner(System.in);
        String playerName = scanner.nextLine().toLowerCase();

        //create a game world to store features and player;

        GameWorld gameWorld = new GameWorld();
        Player player = new Player(playerName);
        gameWorld.setPlayer(player);

        System.out.println(player.getName()+" awakens in a barren moor. Try looking with the command \"look\"");
        String command;
        do{
            command = scanner.nextLine();
        }while(!command.toLowerCase().equals("look"));

        System.out.println("Grey foggy clouds float oppressively close to you,\n" +
                "reflected in the murky grey water which reaches up your\n" +
                "shins.\n" +
                "Some black plants barely poke out of the shallow water.\n" +
                "Try “north”,”south”,”east”,or “west”\n" +
                "You notice a small watch-like device in your left hand.\n" +
                "It has hands like a watch, but the hands don’t seem to tell\n" +
                "time.");

        System.out.println("The dial reads: "+ player.getCompass().getNearestFeatureDistance(player.getPlayerLocation(),gameWorld.getFeatures(),false)+ "m");
        while(true){
            System.out.println("Move in a direction with the following commands: "+ "\"north\""+"\"south\""+"\"east\""+"\"west\"");
            String move = scanner.nextLine().toLowerCase();
            if(move.equals("gladys")) {
                cheat();
                break;
            }
            player.move(move);
            double distance = player.getCompass().getNearestFeatureDistance(player.getPlayerLocation(),gameWorld.getFeatures(),false);
            if (distance <3){
                Feature f = player.getCompass().getNearestFeature(player.getPlayerLocation(),gameWorld.getFeatures(),true);
                System.out.println("Congratulations You have reached " + f.getName());
                System.out.println("You can interact with the special features using a magic Interface. Its magic!!!\nUse the commands \"touch\", \"open\", and \"kick\"");
                command = scanner.nextLine().toLowerCase();
                String interactResult = "";

                //commands are used to demonstrate interfaces using player interaction
                switch(command){
                    case "touch": interactResult=f.OnTouch();
                    break;
                    case "open": interactResult=f.OnOpen();
                        break;
                    case "kick": interactResult=f.OnKick();
                        break;
                }
                System.out.println(interactResult);
                System.out.println("Now go find another");
                System.out.println("There is more to do yet, after all this place is infinite");
//                System.out.println("The dial reads: " + distance + "m");

            } else {
                System.out.println("The dial reads: " + distance + "m");
            }

        }
    }

    private static void cheat(){
        System.out.println("A portal opens up in front of you and you walk through it\nYou awaken in your bed\nIt was all a dream... or was it");
    }

}
