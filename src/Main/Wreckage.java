package Main;

public class Wreckage extends Feature {
    Wreckage(){
        name += " A giant wreckage";
    }

    @Override
    public String OnOpen() {
        return "You open a door on the side of the wreckage and hear strange growling like noises and then close the door because its better to be safe than sorry.";
    }
}
