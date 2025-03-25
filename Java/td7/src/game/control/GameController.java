package game.control;
import game.model.Player;
import game.gui.GameView;

public class GameController {
    GameView view;
    Player player;
    public GameController(GameView view) {
        this.view = view;
    }

    public void startGame() {
        view.displayWelcomeMessage();
        this.registerPlayer();
    }

    public void registerPlayer() {
        String name = view.askForPlayerName();
        this.player = new Player(name);
        view.displayWelcomeMessagePlayer(player.getName());
    }
}
