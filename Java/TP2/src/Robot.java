public class Robot {
    private final Position position;
    private Direction direction;
    private final String name;

    public Robot(Position position, Direction direction, String name) {
        this.position = position;
        this.direction = direction;
        this.name = name;
    }

    public Robot(Integer x, Integer y, Direction direction, String name) {
        this(new Position(x, y), direction, name);
    }

    public Robot(String name) {
        this(new Position(0, 0), Direction.NORTH, name);
    }

    public Robot() {
        this(new Position(0,0), Direction.NORTH, "Robot");
    }

    @Override
    public String toString() {
        return "Robot{" +
                "position=" + position +
                ", direction=" + direction +
                '}';
    }

    public String getLocation() {
        return "(" + position.getX() + ", " + position.getY() + ")" +"\n" + "Orientation: " + direction;
    }

    public void move() {
        switch (direction) {
            case NORTH:
                this.position.setY(this.position.getY() + 1);
                break;
            case SOUTH:
                this.position.setY(this.position.getY() - 1);
                break;
            case EAST:
                this.position.setX(this.position.getX() - 1);
                break;
            case WEST:
                this.position.setX(this.position.getX() + 1);
                break;
        }
        System.out.println("Moving " + name + " at " + position);
        System.out.println("Now at " + this.position + " toward " + this.direction);
    }

    public void turnLeft() {
        switch (direction) {
            case NORTH:
                this.direction = Direction.EAST;
                break;
            case SOUTH:
                this.direction = Direction.WEST;
                break;
            case EAST:
                this.direction = Direction.SOUTH;
                break;
            case WEST:
            default:
                this.direction = Direction.NORTH;
                break;
        }
        System.out.println(this.name + " turn left");
        System.out.println("Now at " + this.position + " toward " + this.direction);
    }

    public void turnRight() {
        switch (direction) {
            case NORTH:
                this.direction = Direction.WEST;
                break;
            case SOUTH:
                this.direction = Direction.EAST;
                break;
            case WEST:
                this.direction = Direction.SOUTH;
                break;
            case EAST:
            default:
                this.direction = Direction.NORTH;
                break;
        }
        System.out.println(this.name + " turned right");
        System.out.println("Now at " + this.position + " toward " + this.direction);
    }

    public Position getPosition() {
        return position;
    }

    public Direction getDirection() {
        return direction;
    }

    public String getName() {
        return name;
    }
}
