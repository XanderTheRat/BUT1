package zoo.model.visitor;

public class Toddler extends Child{
    public Toddler(int age) {
        super(age);
    }

    @Override
    public String whoAmI() {
        return super.whoAmI() + "I'm between 1 and 6 Year Old : I'm a toddler. ";
    }

    @Override
    public Integer priceOfTicket() {
        return super.REGULAR_TICKET/4;
    }
}
