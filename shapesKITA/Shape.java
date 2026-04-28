package shapesKITA;

public abstract class Shape {
    protected String color;

    public Shape() { this.color = "unknown"; }
    public Shape(String color) { this.color = color; }

    public String getColor() { return color; }

    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape[color=" + color + "]";
    }
}