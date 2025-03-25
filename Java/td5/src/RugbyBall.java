public class RugbyBall extends Ball {
    public RugbyBall(Integer size) {
        super(size);
    }

    @Override
    public String bounce() {
        return "A bounce for this ball";
    }
}
