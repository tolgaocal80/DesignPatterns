public class General extends GameUnit{

    private String state = "idle";

    public void boostMorale(){
        this.state = "Moral boost";
    }

    @Override
    public String toString() {
        return "General "+state+" @ "+getPosition() + " source : "+ getValue();
    }

    @Override
    void reset() {
        throw new UnsupportedOperationException("Not supported");
    }

    @Override
    public GameUnit clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Method not supported");
    }


}
