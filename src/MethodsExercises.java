
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

import java.util.*;
public class MethodsExercises {
    public static void main(String[] args) {
//        System.out.println(exPonent(6,2));
//        System.out.println(addStuff(4,3));
//        System.out.println(minusStuff(18, 10));
//        System.out.println(Quotient(10 , 2))
//        System.out.println(ModuloNumbers(7, 3));

//        Scanner in = new Scanner(System.in);
//        System.out.print("Input the first number: ");
//        int n1 = in.nextInt();
//        System.out.print("Input the second number: ");
//        int n2 = in.nextInt();
//        System.out.println("\nResult: " + multiply(n1,n2));


        Person rick = new Person();
        rick.firstName = "Rick";
        rick.lastName = "Sanchez";
        System.out.println(rick.sayHello());
    }


    public static long exPonent(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else if (exponent == 1) {
            return base;
        } else if (exponent == 2) {
            return base * base;
        }
        return base * exPonent(base, exponent - 1);

    }

    public static long addStuff(int x, int y) {
        return x + y;
    }

    public static long minusStuff(int x, int y) {
        return x - y;
    }

    public static long Quotient(int x, int y) {
        return x / y;
    }

    public static long ModuloNumbers(int x, int y) {
        return x % y;
    }

    public static int multiply(int n1, int n2) {
        int result = 0;
        boolean negative_num = (n1 < 0 && n2 >= 0) || (n2 < 0 && n1 >= 0);
        boolean positive_num = !negative_num;
        n1 = Math.abs(n1);
        for (int i = 0; i < n1; i++) {
            if (negative_num && n2 > 0 || positive_num && n2 < 0)
                result -= n2;
            else
                result += n2;
        }

        return result;
    }
    static class Person {
        public String firstName;
        public String lastName;

        public String sayHello() {
            return String.format("Hello from %s %s!", firstName, lastName);
        }

            // prints "Hello from Rick Sanchez!"
        }
    }

