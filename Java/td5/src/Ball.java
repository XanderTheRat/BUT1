public abstract class Ball implements Bounceable {
    protected Integer size;

    public Ball(Integer size) {
        this.size = size;
    }

    public Integer getSize() {
        return this.size;
    }
}
