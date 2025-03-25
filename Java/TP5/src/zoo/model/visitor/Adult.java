package zoo.model.visitor;

public class Adult extends Visitor {
    @Override
    public String whoAmI() {
        return sayHello() + "I'm an adult.";
    }

    public Integer priceOfTicket() {
        return REGULAR_TICKET;
    }
}
