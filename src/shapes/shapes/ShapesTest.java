package shapes;

public class ShapesTest {
    public static void main(String[] args) {
    shapes.Measurable box1;
      box1 = new Rectangle(7, 11);
        System.out.println(box1.getArea());
        System.out.println(box1.getPerimeter());

         shapes.Square box2 = new shapes.Square(5);
        System.out.println(box2.getPerimeter());
        System.out.println(box2.getArea());
           }
       }




