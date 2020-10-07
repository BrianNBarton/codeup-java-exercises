import org.w3c.dom.ls.LSOutput;

import java.util.HashSet;
import java.util.Set;

public class LeetCode2 {
    public static void main(String[] args) {

 String[] thisSting = {"sos"};

        System.out.println(uniqueMorseRepresentations(thisSting));
        System.out.println(toLowerCase("STRING"));
    }
    public static String toLowerCase(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(length);

        for(int i = 0; i< length; ++i){
            char c = str.charAt(i);
            if(c >= 65 && c <= 90)
                sb.append((char)(c+32));
            else
                sb.append(c);
        }
        return sb.toString();
    }


    public static Set<String> uniqueMorseRepresentations(String[] words) {
        String[] MORSE = new String[]{".-","-...","-.-.","-..",".","..-.","--.",
                "....","..",".---","-.-",".-..","--","-.",
                "---",".--.","--.-",".-.","...","-","..-",
                "...-",".--","-..-","-.--","--.."};

        Set<String> seen = new HashSet();
        for (String word: words) {
            StringBuilder code = new StringBuilder();
            for (char c: word.toCharArray())
                code.append(MORSE[c - 'a']);
            seen.add(code.toString());
        }

        return seen;
    }
}