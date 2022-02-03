public class SquareP extends Prism{
    private float height;
    private float side;

    public SquareP(float side, float height) {
        super(side, height);
    }

    @Override
    public float getHeight() {
        return height;
    }

    @Override
    public float getSide() {
        return side;
    }

    @Override
    public void setHeight(float height) {
        this.height = height;
    }

    @Override
    public void setSide(float side) {
        this.side = side;
    }

    @Override
    public double baseArea() {
        return this.side*this.side;
    }

    @Override
    public double volume() {
        return Math.pow(this.baseArea(),2) *this.height;
    }

}
