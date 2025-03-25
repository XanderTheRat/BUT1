package td2;

public class ComputerPioneer {
    private final String firstName;
    private final String lastName;
    private final Device device;

    public ComputerPioneer(String firstName, String lastName, Device device) /* Signature de la fonction */{
        this.firstName = firstName;
        this.lastName = lastName;
        this.device = device;
    }

    @Override
    public String toString() {
        return this.firstName + " " + this.lastName + " is a computer pioneer. ";
    }

    public Device getDevice() {
        return device;
    }

    public Boolean worksOn(Device device) {
        if ( this.device.equals(device) ) {
            return true;
        }
        return false;
    }
}