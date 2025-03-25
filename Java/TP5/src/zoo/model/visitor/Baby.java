package zoo.model.visitor;

public class Baby extends Child{
    public Baby() {
        super(0);
    }

    @Override
    public String whoAmI() {
        return super.whoAmI() + "I'm under 1 Year Old : I'm a baby. ";
    }

    @Override
    public Integer priceOfTicket() {
        return 0;
    }

    public String noise() {
        return "waaaaaaaaa";
    }
}
