public class Main {
    public static void main(String[] args) {
        Robot viper = new Robot("viper");
        System.out.println("viper is actually : ");
        viper.turnRight();
        viper.turnRight();
        viper.turnRight();
        viper.turnRight();
        System.out.println();

        Robot python = new Robot(new Position(5, 10), Direction.EAST, "python");
        System.out.println("python is actually : ");
        python.turnLeft();
        python.turnLeft();
        python.turnLeft();
        python.turnLeft();
        System.out.println();

        Robot anaconda = new Robot(20, 30, Direction.SOUTH, "anaconda");
        System.out.println("anaconda is actually : ");
        anaconda.turnLeft();
        anaconda.move();
        anaconda.turnLeft();
        anaconda.move();
        anaconda.turnLeft();
        anaconda.move();
        anaconda.turnLeft();
        anaconda.move();
        System.out.println();
    }
}