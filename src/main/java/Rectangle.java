   public class Rectangle extends Shape implements CountablePerimeter{
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


       @Override
       public double getPerimeter() {
           return ((width+length) *2);
       }
   }
