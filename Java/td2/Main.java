package td2;


public class Main{
    public static void main(String[] args) {
        Device babbagDevice = new Device("Babbage Analytical Machine", 1837);
        ComputerPioneer Ada = new ComputerPioneer("Ada", "Lovelace", babbagDevice);
        System.out.println(Ada);
        if ( Ada.worksOn(babbagDevice) ) {
            System.out.println("Tout marche");
        }
        else {
            System.out.println("Y'a problème");
        }

        Device turingDevice = new Device("Turing Engine", 1936);
        ComputerPioneer Alan = new ComputerPioneer("Alan", "Turing", turingDevice);
        System.out.println(Alan);
        if( Alan.worksOn(turingDevice) ) {
            System.out.println("Tout marche");
        }
        else {
            System.out.println("Y'a problème");
        }
        /*
        System.out.println("-------------------------------------------");
        System.out.println("Ada travaille sur la machine de turing : " + Ada.worksOn(turingDevice));
        System.out.println("Ada travaille sur la machine de Babbage : " + Ada.worksOn(babbagDevice));
        System.out.println("Alan travaille sur la machine de turing : " + Alan.worksOn(turingDevice));
        System.out.println("Alan travaille sur la machine de Babbage : " + Alan.worksOn(babbagDevice));
        System.out.println("-------------------------------------------");
         */
        Device adaMachine = Ada.getDevice();
        Device turingMachine = Alan.getDevice();

        System.out.println("Ada travaille sur la machine de turing : " + turingDevice.equals(adaMachine));
        System.out.println("Ada travaille sur la machine de Babbage : " + babbagDevice.equals(adaMachine));
        System.out.println("Alan travaille sur la machine de turing : " + turingDevice.equals(turingMachine));
        System.out.println("Alan travaille sur la machine de Babbage : " + babbagDevice.equals(turingMachine));

    }
}