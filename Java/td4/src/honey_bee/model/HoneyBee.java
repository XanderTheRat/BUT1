package honey_bee.model;

public abstract class HoneyBee{
    private final String name;
    protected HoneyBee(String name){
        this.name = name;
    }

    public String doYourJob() {
        return this.name + " - " + "I'm a honey bee";
    }

    public String fly(){
        return "I believe I can fly";
    }

    public String getName() {
        return name;
    }
}
