package td2;
public class Device {
    private final String name;
    private final Integer inventionYear;

    public Device(String name, Integer inventionYear) {
        this.name = name;
        this.inventionYear = inventionYear;
    }

    @Override
    public String toString() {
        return "The " + this.name + " was invented in " + this.inventionYear;
    }
}