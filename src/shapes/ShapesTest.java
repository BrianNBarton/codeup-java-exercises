package shapes;

public class ShapesTest {
    public static void main(String[] args) {

        Rectangle box1 = new Rectangle(5, 4);
        System.out.println("the area of rectangle:  " + box1.getArea());
        System.out.println("the perimeter of the rectangle: " + box1.getPerimeter());

         Rectangle box2 = new Square(7);
        System.out.println("the perimeter of the square:  " + box2.getPerimeter());
        System.out.println("the area of the square:  " + box2.getArea());
           }
       }




