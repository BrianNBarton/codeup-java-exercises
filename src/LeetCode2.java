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
    public int surfaceArea(int[][] grid) {
        int[] dr = new int[] {0, 1, 0, -1};
        int[] dc = new int[] {1, 0, -1, 0};

        int N = grid.length;
        int ans = 0;

        for (int r = 0; r <N; ++r)
            for (int c = 0; c < N; ++c)
                if (grid[r][c] > 0) {
                    ans += 2;
                    for (int k = 0; k < 4; ++k) {
                        int nr = r + dr[k];
                        int nc = c+ dc[k];
                        int nv = 0;
                        if (0 <= nr && nr < N && 0 <= nc && nc < N)
                            nv = grid[nr][nc];

                        ans += Math.max(grid[r][c] - nv, 0);
                    }
                }
        return ans;
    }
    int result = 0;
    public int tribonacci(int n) {

        if(n == 0)
        {
            return 0;
        }

        if(n == 1 || n == 2)
        {
            return 1;
        }

        int result [] = new int[n+1];
        result[0] = 0;
        result[1] = 1;
        result[2] = 1;

        for(int i = 3 ; i<=n ; i++)
        {
            result[i] = result[i-1] + result[i-2] + result[i-3];
        }

        return result[n];
    }

}