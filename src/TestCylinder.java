public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder("red",1.5,2.3);
        System.out.println(cylinder.getVolume());
        cylinder.getArea();
        System.out.println(cylinder);
    }
}
