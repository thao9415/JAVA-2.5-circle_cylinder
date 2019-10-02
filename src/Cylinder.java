public class Cylinder extends Circle {
    private double height = 1.0;

    public Cylinder() { }

    public Cylinder(String color, double radius, double height) {
        super(color, radius);
        this.height = height;
    }
    public double getHeight() {
        return this.height;
    }
    public void setHeight(double height) {
        this.height=height;
    }
    public double getVolume() {
        return getHeight()*getArea();
    }

    @Override
    public String toString() {
        return "toi la hinh tru co ban kinh "
                + getRadius();
    }
}
