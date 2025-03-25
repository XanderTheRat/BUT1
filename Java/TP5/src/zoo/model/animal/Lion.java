package zoo.model.animal;

import zoo.model.Noisy;

public class Lion extends Animal{
    public Lion(String name) {
        super(name);
    }

    @Override
    public String noise() {
        return "Roar !";
    }

}
