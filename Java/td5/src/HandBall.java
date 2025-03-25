public class HandBall extends Ball{
    public HandBall(Integer size) {
        super(size);
    }

    @Override
    public String bounce(){
        return "A bounce for this ball";
    }
}
