 public class Tringle extends Shape{

 double height;

 double baseOfTringle;

    public Tringle(double height, double baseOfTringle) {
        this.height = height;
        this.baseOfTringle = baseOfTringle;
    }




    @Override
    public double getArea (){
        return height * baseOfTringle * 0.5;
    }
}
