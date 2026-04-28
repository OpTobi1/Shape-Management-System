package shapesKITA;

class Square extends Rectangle {
    public Square() { super(); }
    public Square(double side) { super(side, side); }
    public Square(double side, String color) { super(side, side, color); }

    public double getSide() { return length; }
    @Override
    public String toString() { return "Square[" + super.toString() + "]"; }
}