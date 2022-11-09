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
        System.out.printf("Base: %f\nHeight: %f\n",getBase(), getHeight());
    }

    public static void main(String []args) {
        //Question a
        System.out.println("\nQuestion a");
        Point aPoint = new Point(200, 300);
        Shape s1 = new Shape(aPoint);
        s1.Print();
        //Question b
        System.out.println("\nQuestion b");
        Point bPoint = new Point(5, 5);
        Triangle t = new Triangle(3, 5);
        t.setaPoint(bPoint);
        //Question c
        System.out.println("\nQuestion c");
        Shape s2 = t;
        s2.Print();
        Triangle t2 = new Triangle();
        //Question d
        System.out.println("\nQuestion d");
        System.out.println("It is not able to compile");
        //t2 = s1; It is not able to compile.
        //Question e
        Triangle tptr = t;
        //Question f
        System.out.println("\nNQuestion f");
        Shape sptr = tptr;
        //Question g
        System.out.println("\nQuestion g");
        tptr.Print();
        sptr.Print();
    }
}
