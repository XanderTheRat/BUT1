package zoo.model.animal;
import zoo.model.Noisy;

public abstract class Animal implements Noisy {
    protected String name;
    protected Animal(String animal) {
        this.name = animal;
    }

    public String name() {
        return this.name;
    }
}
