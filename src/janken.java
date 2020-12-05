import java.util.Random;
import java.util.Scanner;

class janken {

    public static void main(String[] args) {

        Random random = new Random();
        // Use Scanner for getting input from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter your move :");

        String myMove = scanner.nextLine();

//        randomly generate a move
        int rand = (int) (Math.random() * 3);
        String opponentMove = "";
        if (rand == 0) {
            opponentMove = "rock";
        } else if (rand == 1) {
            opponentMove = "paper";
        } else {
            opponentMove = "scissors";
        }
        System.out.println("opponent move : " + opponentMove);

        //win lose draw cases
        if (myMove.equals(opponentMove)) {
            System.out.println("tie!");
        } else if ((myMove.equals("rock") && opponentMove.equals("scissors")) ||
                (myMove.equals("scissors") && opponentMove.equals("paper")) ||
                (myMove.equals("paper") && opponentMove.equals("rock"))) {
            System.out.println("winner!!");
        } else {
            System.out.println("LOSER HAHA");
        }

    }

}
