import java.util.Scanner;

public class ShapeDemo {
   public static void main(String [] args) {
       Scanner scanner = new Scanner(System.in);

       System.out.println("Выберите номер  фигуры: 1.треугольник; 2.круг; 3.прямоугольник");
       int number = scanner.nextInt();


       if(number ==1){
               System.out.println("Введите высоту и оснавания");
           double numberFirst = scanner.nextInt();
           double numberSacond = scanner.nextInt();
           Tringle tringle = new Tringle(numberFirst, numberSacond);
           System.out.println( "Площадь треугольника = " + tringle.getArea());


      } else if ( number == 2) {
         System.out.println("Введите радиус");
         double radius = scanner.nextInt();
         Circle circle = new Circle(radius);
         System.out.println( "Площадь круга = " + circle.getArea());
       }else {
           System.out.println( "Введите ширину и длину");
           double width = scanner.nextInt();
           double length = scanner.nextInt();
           Rectangle rectangle = new Rectangle(width, length);
           System.out.println( "Площадь прямоугольника  = " + rectangle.getArea());
       }

   }
}
