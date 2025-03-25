package game.gui;
import game.control.GameController;
import java.util.Scanner;

public class GameView {
    GameController controller;
    Scanner keyboard = new Scanner(System.in);

    public void setController(GameController controller) {
        this.controller = controller;
    }

    public void displayWelcomeMessage() {
        System.out.println("- - - - - - - - - - - - - - - - - - - - - ");
        System.out.println("- - Welcome in our wonderful cardgame - - ");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - ");
    }

    public String askForPlayerName() {
        System.out.println("Enter player name: ");
        String name = keyboard.nextLine();
        return name;
    }

    public void displayWelcomeMessagePlayer(String playerName) {
        System.out.println("Welcome ! Let's start " + playerName + " !");
    }
}
