public class Triangle extends Shape{
    private double base, height;
    public Triangle() {

    }

    public Triangle(double base, double height) {
        super();
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void Print() {
        super.Print();
        System.out.printf("Base: %f\n Height: %f\n",getBase(), getHeight());
    }

    public static void main(String []args) {
        Point aPoint = new Point(200, 300);
        Shape s1 = new Shape(aPoint);
        s1.Print();
        Point bPoint = new Point(5, 5);
        Triangle t = new Triangle(3, 5);
        t.setaPoint(bPoint);
        Shape s2 = t;
        s2.Print();
//        Triangle t2 = (Triangle) s1;
        Triangle tptr = t;
        Shape sptr = tptr;
        tptr.Print();
        sptr.Print();
    }
}
