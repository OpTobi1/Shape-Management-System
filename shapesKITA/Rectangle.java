package shapesKITA;

class Rectangle extends Shape {
    protected double width, length;

    public Rectangle() { this(1.0, 1.0); }
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color) {
        super(color);
        this.width = width;
        this.length = length;
    }

    public double getLength() { return length; }
    @Override
    public double getArea() { return width * length; }
    @Override
    public double getPerimeter() { return 2 * (width + length); }
    @Override
    public String toString() { return "Rectangle[width=" + width + ", length=" + length + ", " + super.toString() + "]"; }
}