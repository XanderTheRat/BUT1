package honey_bee.model;

public class Drone extends HoneyBee{
    public Drone(String name){
        super(name);
    }

    @Override
    public String doYourJob() {
        return "I'm a drone, I'm going to date our Queen !";
    }
}
