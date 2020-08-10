import java.util.Scanner;

public class ConsoleExercises {
public static void main(String[] args) {

    double pi = 3.14159;

    System.out.printf("look two digits of pi %.2f.\n\n", pi);

    Scanner scan = new Scanner(System.in);


    System.out.print("Please enter 3 words: ");
    String str0 = scan.next();
    String str1 = scan.next();
    String str2 = scan.next();
    System.out.println(String.format("str0: %s str1: %s str2: %s\n",str0, str1, str2));





    }


}

class AreaOfRectangle {
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of Rectangle:");
        double length = scanner.nextDouble();
        System.out.println("Enter the width of Rectangle:");
        double width = scanner.nextDouble();
        //Area = length*width;
        double area = length*width;
        System.out.println("Area of Rectangle is:"+area);
        double perimeter = length*2 + width*2;
        System.out.println("perimeter is "+perimeter);

    }
}
