package shapes;

public abstract class Quadrilateral extends Shape{
    protected double length;
    protected double width;

    public Quadrilateral() {
    }

    public Quadrilateral(double width, double length) {
        this.length = length;
        this.width = width;

    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }


    public abstract void setLength(double length);
    public abstract void setWidth(double width);



//
//    @Override
//    public double getPerimeter() {
//        return 2 * getWidth() + 2 * getLength();
//    }
//
//    @Override
//    public double getArea() {
//        return getWidth() * getLength();
//    }
//}
}
