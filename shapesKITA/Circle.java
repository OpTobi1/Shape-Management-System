package shapesKITA;

class Circle extends Shape {
    private double radius;

    public Circle() { this(1.0); }
    public Circle(double radius) { this.radius = radius; }
    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() { return radius; }
    @Override
    public double getArea() { return Math.PI * radius * radius; }
    @Override
    public double getPerimeter() { return 2 * Math.PI * radius; }
    @Override
    public String toString() { return "Circle[radius=" + radius + ", " + super.toString() + "]"; }
}