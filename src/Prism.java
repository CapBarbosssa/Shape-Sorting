import java.awt.*;

public class Prism extends Shape {
    private float side;
    private float height;



    public Prism(float side,float height) {
        super(height);
        this.side = side;
    }

    public Prism(float side) {
        super(side);
    }

    public float getSide() {
        return side;
    }

    @Override
    public float getHeight() {
        return height;
    }

    public void setSide(float side) {
        this.side = side;
    }

    @Override
    public void setHeight(float height) {
        this.height = height;
    }

    @Override
    public double baseArea() {
        return this.side * this.side;
    }

    @Override
    public double volume() {
        return this.side * this.side * this.height;
    }

    @Override
    public int compareTo(Shape that) {
        if( this.height > that.height )
        {
            return 1;
        }else if( this.height < that.height ) {
            return -1;
        }else
        {
            return 0;
        }
    }
}
