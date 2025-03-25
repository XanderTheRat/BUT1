package farwest;

public class Enfant extends PersonnageFarWest{
    private Integer age;
    public Enfant(String name, Integer age){
        super(name);
        this.age = age;
    }


    @Override
    public String decrire() {
        return super.decrire() + " J'ai " + age + " ans !";
    }
}