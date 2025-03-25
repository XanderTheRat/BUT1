package utils;
import java.util.Scanner;

public class StrInput {
    private String chaine;
    private String str;
    private final Scanner input;
    public StrInput(String chaine) {
        this.chaine = chaine;
        this.input = new Scanner(System.in);
        System.out.println(this.chaine);
        this.str = input.nextLine();
        input.close();
    }

    public String RecupString() {
        return this.str;
    }

    public void ChangerChaine(String chaine){
        this.chaine = chaine;
    }

    public void ChangerString() {
        System.out.println(this.chaine);
        this.str = input.nextLine();
    }
    
}
