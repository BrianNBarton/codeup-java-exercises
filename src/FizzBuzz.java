public class FizzBuzz {
        public static void fizzBuzz(int num)
        {
            for (int i = 1; i <= num; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.printf("\n%d: fizz buzz",i);
                } else if (i % 5 == 0) {
                    System.out.printf("\n%d: buzz",i);
                } else if (i % 3 == 0) {
                    System.out.printf("\n%d: fizz",i);
                }

        }
    }

    public static void main(String[] args) {
            fizzBuzz(50);
    }

    }