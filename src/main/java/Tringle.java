 public class Tringle extends Shape implements CountablePerimeter{

 double height;

 double baseOfTringle;
 double sideFirst;
 double sideSacond;


     public Tringle(double height, double baseOfTringle, double sideFirst, double sideSacond) {
         this.height = height;
         this.baseOfTringle = baseOfTringle;
         this.sideFirst = sideFirst;
         this.sideSacond = sideSacond;
     }

     @Override
    public double getArea (){
        return height * baseOfTringle * 0.5;
    }
    @Override
     public double getPerimeter(){
        return (sideFirst + sideSacond +baseOfTringle);
    }
}
