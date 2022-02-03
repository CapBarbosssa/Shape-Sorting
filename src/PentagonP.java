public class PentagonP extends Prism{
    private float side;
    private float height;

    public PentagonP(float side, float height) {
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
        return (5 * this.side * this.side) / (4 * Math.tan(Math.PI/5));
    }

    @Override
    public double volume() {
        return this.baseArea() *this.height;
    }
}
