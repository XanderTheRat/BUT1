public class Position {
    private int x;
    private int y;
    
    public Position(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    public void setX(Integer newx){
        x = newx;
    }
    
    public void setY(Integer newy){
        y = newy;
    }

    @Override
    public String toString() {
        return "(x=" + x + ", y="+ y + ")";
    }
}
