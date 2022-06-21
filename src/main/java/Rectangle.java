   public class Rectangle extends Shape{
  double width;
  double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }



     @Override
    public double getArea() {
        double area = width*length;
        return area;
    }


}
