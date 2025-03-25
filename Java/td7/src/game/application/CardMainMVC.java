package game.application;

import game.control.GameController;
import game.gui.GameView;

public class CardMainMVC {
    public static void main(String[] args) {
        GameView view = new GameView();
        GameController controller = new GameController(view);
        view.setController(controller);
        controller.startGame();
    }
}
