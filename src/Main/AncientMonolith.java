package Main;

public class AncientMonolith extends Feature {
    AncientMonolith(){
        name += " An Ancient monolith";
    }

    @Override
    public String OnTouch() {
        int random = (int)(Math.random()*10)%10;
        String output="";
        switch(random) {

            case 1:
                output = "The monolith emits an aura that turns the black plants into lush green vegetation around the monolith";
                break;
            case 2:
                output = "The monolith blows up!!! Why. Who knows";
                break;

            case 3:
                output = "The monolith does nothing";
                break;
            default:
                output = "The monolith emits an aura of warmth and makes this world a little less dark";
                break;
        }
        return output;
    }

    @Override
    public String OnOpen() {
        return "It's a MONOLITH!!! You can't open it you idiot.";
    }
}
