public class TriangleP extends Prism{

    private float side;
    private float height;

    public TriangleP(float side,float height) {
        super(side,height);
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
        return (Math.sqrt(3)/4)*(this.side*this.side);
    }

    @Override
    public double volume() {
        return this.baseArea() *this.height;
    }


}
