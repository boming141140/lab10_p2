public class Shape {
    protected Point aPoint;
    public Shape(){

    }

    public Shape(Point aPoint) {
        this.aPoint = aPoint;
    }

    public Point getaPoint() {
        return aPoint;
    }

    public void setaPoint(Point aPoint) {
        this.aPoint = aPoint;
    }

    public void Print() {
        System.out.printf("(%f,%f)\n",aPoint.getX_coord(),aPoint.getY_coord());
    }
}
