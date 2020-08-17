package movies;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.Number;
import java.lang.Integer;
import java.lang.Object;

public class MoviesApplication {
    private static Object Integer;

    public static void main(String[] args) {
// build a switch case
        Scanner scanner = new Scanner(System.in);
        Movie[] movies = MoviesArray.findAll();

        System.out.println("Choose your option: ");

        System.out.println(
                "Here are your options\n\n" +
                        "0 - Exit the program\n" +
                        "1 - view all categories\n" +
                        "2 - view animated category\n" +
                        "3 - view drama category\n" +
                        "4 - view horror category\n" +
                        "5 - view scifi category\n" +
                        "enter a number: "

        );



        boolean keepGoing = true;

        while (keepGoing) {
        int input = scanner.nextInt();
            switch (input) {
                case 0:
                keepGoing = false;
                    break;

                case 1:
                    System.out.println("input:  " + input);
                    for (Movie movie : movies) {
                        System.out.println(movie.getName());
                    }
                    break;

                case 2:
                    System.out.println("input:  " + input);
                    for (Movie movie : movies) {
                        if (movie.getCategory().equals("animated")) {
                            System.out.println(movie.getName());
                        }
                    }
                    break;
                case 3:
                    System.out.println("input:  " + input);
                    for (Movie movie : movies) {
                        if (movie.getCategory().equals("drama")) {
                            System.out.println(movie.getName());
                        }
                    }
                    break;
                case 4:
                    System.out.println("input:  " + input);
                    for (Movie movie : movies) {
                        if (movie.getCategory().equals("horror")) {
                            System.out.println(movie.getName());
                        }
                    }
                    break;
                case 5:
                    System.out.println("input:  " + input);
                    for (Movie movie : movies) {
                        if (movie.getCategory().equals("scifi")) {
                            System.out.println(movie.getName());
                        }
                    }
                    break;

                default:
                    System.out.println("try again!");
                    break;
            }
        }
    }


}


//        ArrayList<String> uinput=new ArrayList<String>();
//
//        for(int i=0;i<5;i++){
//
//            Scanner sc=new Scanner(System.in);
//
//            System.out.println("Please enter the name");
//
//            uinput.add(sc.nextLine());
//
//        }
//
//        System.out.println("Now print the array : "+ uinput);

