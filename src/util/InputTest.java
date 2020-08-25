package util;

public class InputTest {
    public static void main(String[] args){

        Input input = new Input();

        System.out.println(input.getString());
        System.out.println(input.getString("Enter a string: "));
        System.out.println(input.yesNo());
        System.out.println(input.yesNo("Yes, or no?"));
        System.out.println(input.getInt(1,100));
        System.out.println(input.getInt());
        System.out.println(input.getInt("Enter an integer: "));
        System.out.println(input.getDouble(2.23,200.433));
        System.out.println(input.getDouble());
        System.out.println(input.getDouble("Enter a double: "));

        System.out.println("Please input a hex number");
        int someHex = input.getHex();
        System.out.println(someHex);
    }
}