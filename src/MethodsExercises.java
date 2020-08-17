
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
        //  System.out.println(factorial(4));
      //  System.out.println(multiply(5, 5));
        //   diceGame();
        // getInteger(1,10);
//        Scanner in = new Scanner(System.in);
//        System.out.print("Input the first number: ");
//        int n1 = in.nextInt();
//        System.out.print("Input the second number: ");
//        int n2 = in.nextInt();
//        System.out.println("\nResult: " + multiply(n1,n2));

//
//        Person rick = new Person();
//        rick.firstName = "Rick";
//        rick.lastName = "Sanchez";
//        System.out.println(rick.sayHello());
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

    public static long factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void diceGame() {
        String rollDice = "";
        do {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter number of sides for pair of dice: ");
            int numSides = scan.nextInt();
            int die1 = rollDie(numSides);
            int die2 = rollDie(numSides);
            System.out.println(String.format("You rolled %d and %d for a total of %d", die1, die2, die1 + die2));
            System.out.print("Would you like to roll again? (Y/N)");
            rollDice = scan.next().toLowerCase();
            System.out.println(rollDice);
        } while (!rollDice.equals("n"));
        System.out.println("DiceGame done.");
    }

    public static int rollDie(int dieSides) {
        int rand = (int) (Math.random() * dieSides);
        return rand;
    }


//    public static int getInteger(int min, int max) {
//        boolean doAgain = true;
//        int num = 0;
//        do {
//            num = sc.nextInt();
//            if (num < min || num > max) {
//                System.out.printf("\nvalue out of %d range\n", num);
//                System.out.printf("enter a number btwn %d and %d: ", min, max);
//            } else {
//                doAgain = false;
//
//
//            }
//            while (doAgain) ;
//            return num;
//        }
    }

//
//        Scanner sc = new Scanner(System.in);
//        int userInput = sc.nextInt();
//        if (userInput < min || userInput > max) {
//            System.out.print("wrong bud");
//            getInteger(min, max);
//        }
//        System.out.println("correct");
//        return userInput;





