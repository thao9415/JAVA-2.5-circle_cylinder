public class Circle {
    private String color;
    private double radius = 1.0;

    public Circle() { }
    public Circle(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }
    public double getRadius() {
        return this.radius;
    }
    public String getColor() {
        return this.color;
    }
    public void setColor(String color) {
        this.color=color;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return getRadius()*getRadius()*Math.PI;
    }
    public double getPerimeter(){
        return getRadius()*2*Math.PI;
    }

    @Override
    public String toString() {
        return "toi la hinh tron co ban kinh "
                + getRadius();
    }
}
