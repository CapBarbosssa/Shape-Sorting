public class OctagonP extends Prism{

    private float side;
    private float height;

    public OctagonP(float side, float height) {
        super(side, height);
    }

    @Override
    public float getSide() {
        return side;
    }

    @Override
    public float getHeight() {
        return height;
    }

    @Override
    public void setSide(float side) {
        this.side = side;
    }

    @Override
    public void setHeight(float height) {
        this.height = height;
    }

    @Override
    public double baseArea() {
        return (2 * (1 + Math.sqrt(2)) * this.side * this.side);
    }

    @Override
    public double volume() {
        return this.baseArea() *this.height;
    }
}
