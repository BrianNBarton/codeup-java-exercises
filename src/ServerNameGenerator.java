import java.util.*;

public class
ServerNameGenerator {

    private String[] Adjectives;

    private String[] Nouns;

  public static String getRandomWord(String[] arr) {
      int index = (int) (Math.random() * arr.length);
      return arr[index];
  }

    public static void main(String[] arg) {


        System.out.println("this stuffd");
        //Object to get user input

   //     ServerNameGenerator sname = new ServerNameGenerator();
//
//        sname.Adjectives = new String[]{"Crunchy", "Spicy", "Humid", "Happy", "Focused", "Shaggy", "Silly", "Tenacious", "Fast", "Old"};
//
//        sname.Nouns = new String[]{"Dog", "Cat", "Ferret", "Birb", "Turtle", "Chameleon", "Fern", "Orchid", "Carrot", "Chips"};

//        System.out.println(Arrays.toString(sname.Adjectives));
//        System.out.println(Arrays.toString(sname.Nouns));

        Scanner in = new Scanner(System.in);

        String[] starters = {"the", "a" };
;
        String[] Adjectives = {"Crunchy", "Spicy", "Humid", "Happy", "Focused", "Shaggy", "Silly", "Tenacious", "Fast", "hot"};


        String[] Nouns = {"Dog", "Cat", "Ferret", "Birb", "Turtle", "Chameleon", "Fern", "Orchid", "Carrot", "Chips"};

//        String[] Char = { "a", "a", "b", "B", "c", "c", "!", "@",
//        }

        System.out.print("How many Server Names do you want: ");
        //Get user input
        int numberOfTest = in.nextInt();

        for (int i = 0; i < numberOfTest; i++) {
            String Start = getRandomWord(starters);
            String Adj = getRandomWord(Adjectives);
            String Noun = getRandomWord(Nouns);
            System.out.println(Start +" "+ Adj + "-" + Noun);
        }
    }

}



//
//
//    import java.util.*;
//
//public class ServerNameGenerator {
//
//    private String[] Adjectives;
//
//    private String Nouns;
//
//
//
//    public static void main(String[] arg){
//        //Object to get user input
//
//        ServerNameGenerator sname = new ServerNameGenerator();
//
//        sname.Adjectives = new String[]{"Crunchy", "Spicy", "Humid", "Happy", "Focused", "Shaggy", "Silly", "Tenacious", "Fast", "Old"};
//
//        //sname.Nouns = new String[]{"Dog", "Cat", "Ferret", "Birb", "Turtle", "Chameleon", "Fern", "Orchid", "Carrot", "Chips"};
//
//        System.out.println(Arrays.toString(sname.Adjectives));
//        System.out.println(Arrays.toString(sname.Nouns));
//
//        Scanner in = new Scanner(System.in);
//
//        //String array
////        String[] Adjectives = { "Crunchy", "Spicy", "Humid", "Happy", "Focused", "Shaggy", "Silly", "Tenacious", "Fast", "Old"};
////
////        String[] Nouns = { "Dog", "Cat", "Ferret", "Birb", "Turtle", "Chameleon", "Fern", "Orchid", "Carrot", "Chips" } ;
//
//        System.out.print("How many Server Names do you want: ");
//        //Get user input
//        int numberOfTest = in.nextInt();
//
////       // for(int i = 0; i < numberOfTest; i++){
////            int index = (int)(Math.random() * 10);
////            int index2 = (int)(Math.random() * 10);
////            System.out.println(Adjectives[index] + "-" + Nouns[index2]);
//    }
//}
//
//
//
//
//
