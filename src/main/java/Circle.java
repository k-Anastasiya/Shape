 public class Circle extends Shape implements CountablePerimeter {

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea (){


        return (radius * radius * 3.14);
    }

    @Override
     public double getPerimeter (){
        return (2 * radius * 3.14);
    }

}
