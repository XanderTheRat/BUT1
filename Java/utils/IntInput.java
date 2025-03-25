package utils;
import java.util.Scanner;

public class IntInput {
    private String chaine;
    private Integer nombre;
    private final Scanner input;

    public IntInput(String chaine){
        this.chaine = chaine;
        this.input = new Scanner(System.in);
        System.out.println(this.chaine);
        this.nombre = input.nextInt();
        input.close();
    }

    public Integer RecupInt() {
        return this.nombre;
    }

    public void ChangerChaine(String chaine){
        this.chaine = chaine;
    }

    public void ChangerNombre() {
        System.out.println(this.chaine);
        this.nombre = input.nextInt();
    }
}
