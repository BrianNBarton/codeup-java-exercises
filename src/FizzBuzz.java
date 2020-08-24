public class FizzBuzz {
    public static void fizzBuzz(int num) {
        for (int i = 1; i < num; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.printf("\n%d: fizz buzz", i);
            } else if (i % 5 == 0) {
                System.out.printf("\n%d: buzz", i);
            } else if (i % 3 == 0) {
                System.out.printf("\n%d: fizz", i);
            } else {
                System.out.printf("\n",i);
            }

        }
    }

    public static void main(String[] args) {
        fizzBuzz(50);
         skidBuzz(50);
    }

    public static void skidBuzz(int num) {
        for (int i = 0; i <= num; i++) {
            if (i % 7 == 0 && i % 9 == 0) {
                System.out.printf("\n%d: Skiddbuzz", i);
            } else if (i % 7 == 0) {
                System.out.printf("\n%d: buzz", i);
            } else if (i % 9 == 0) {
                System.out.printf("\n%d: skid", i);
            }

        }
    }
}


