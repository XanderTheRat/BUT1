package zoo.model.visitor;

public abstract class Visitor {
    protected Integer REGULAR_TICKET = 10;
    public String sayHello() {
        return "Hello! I'm a visitor.";
    }
    abstract public String whoAmI();
    abstract public Integer priceOfTicket();
}
