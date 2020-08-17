import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
public class ServerNameGenerator {


    public static void main(String[] arg){
        //Object to get user input
        Scanner in = new Scanner(System.in);

        //String array
        String[] Adjectives = { "Crunchy", "Spicy", "Humid", "Happy", "Focused", "Shaggy", "Silly", "Tenacious", "Fast", "Old"};

        String[] Nouns = { "Dog", "Cat", "Ferret", "Birb", "Turtle", "Chameleon", "Fern", "Orchid", "Carrot", "Chips" } ;

        System.out.print("How many Server Names do you want: ");
        //Get user input
        int numberOfTest = in.nextInt();

        for(int i = 0; i < numberOfTest; i++){
            int index = (int)(Math.random() * 10);
            int index2 = (int)(Math.random() * 10);
            System.out.println(Adjectives[index] + "-" + Nouns[index2]);
        }
    }


}

