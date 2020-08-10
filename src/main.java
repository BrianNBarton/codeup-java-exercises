import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.net.SocketOption;
import java.net.SocketPermission;
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        System.out.println("hello, world!");

//
//
//        int Favorite_Number = 27;
//        System.out.println(Favorite_Number);
//
//        long myNumber = 3;
//
//
//      String MyString = "Look at me coding Java";
//    System.out.println(MyString);
//
//    char FirstCharacter = 'B';
//    System.out.println(FirstCharacter);
//
//    long MyNumber = ;
//    System.out.println(MyNumber);


        int x = 7;
        System.out.println(x++);
        System.out.println(x);
        System.out.println(++x);

//
//        String Class = "things";
//
//


        long money = Integer.MAX_VALUE;
       System.out.println(money);

//
//        int three = (int) "three";


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter something: ");
        String userInput = scanner.next();

        System.out.println("You entered: --> \"" + userInput + "\" <--");

        double pi = 3.14159;

       // System.out.println("the value of pi is approxomitely \"" + pi + "\"");

    }
}



