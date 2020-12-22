//import org.w3c.dom.ls.LSOutput;
//
//import javax.swing.tree.TreeNode;
//import java.util.*;

public class LeetCode2 {



    private int maxSubArray(int[] nums, int start, int end) {
        if(start == end) return nums[start];

        int mid = start + (end - start) / 2;
        int leftSum = maxSubArray(nums, start, mid);
        int rightSum = maxSubArray(nums, mid+1, end);
        int crossSum = maxCrossSum(nums, start, mid, end);

        return Math.max(leftSum, Math.max(rightSum, crossSum));
    }

    private int maxCrossSum(int[] nums, int start, int mid, int end) {
        int leftSum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=mid; i>=start; i--) {
            sum = sum + nums[i];
            if(sum > leftSum)
                leftSum = sum;
        }
        sum=0;
        int rightSum = Integer.MIN_VALUE;
        for(int j=mid+1; j<=end; j++) {
            sum = sum + nums[j];
            if(sum > rightSum)
                rightSum = sum;
        }
        return leftSum + rightSum;
    }
}
// String[] thisSting = {"sos"};
//
//        System.out.println(uniqueMorseRepresentations(thisSting));
//        System.out.println(toLowerCase("STRING"));
//    }
//    public static String toLowerCase(String str) {
//        int length = str.length();
//        StringBuilder sb = new StringBuilder(length);
//
//        for(int i = 0; i< length; ++i){
//            char c = str.charAt(i);
//            if(c >= 65 && c <= 90)
//                sb.append((char)(c+32));
//            else
//                sb.append(c);
//        }
//        return sb.toString();
//    }
//
//
//    public static Set<String> uniqueMorseRepresentations(String[] words) {
//        String[] MORSE = new String[]{".-","-...","-.-.","-..",".","..-.","--.",
//                "....","..",".---","-.-",".-..","--","-.",
//                "---",".--.","--.-",".-.","...","-","..-",
//                "...-",".--","-..-","-.--","--.."};
//
//        Set<String> seen = new HashSet();
//        for (String word: words) {
//            StringBuilder code = new StringBuilder();
//            for (char c: word.toCharArray())
//                code.append(MORSE[c - 'a']);
//            seen.add(code.toString());
//        }
//
//        return seen;
//    }
//    public int surfaceArea(int[][] grid) {
//        int[] dr = new int[] {0, 1, 0, -1};
//        int[] dc = new int[] {1, 0, -1, 0};
//
//        int N = grid.length;
//        int ans = 0;
//
//        for (int r = 0; r <N; ++r)
//            for (int c = 0; c < N; ++c)
//                if (grid[r][c] > 0) {
//                    ans += 2;
//                    for (int k = 0; k < 4; ++k) {
//                        int nr = r + dr[k];
//                        int nc = c+ dc[k];
//                        int nv = 0;
//                        if (0 <= nr && nr < N && 0 <= nc && nc < N)
//                            nv = grid[nr][nc];
//
//                        ans += Math.max(grid[r][c] - nv, 0);
//                    }
//                }
//        return ans;
//    }
//    int result = 0;
//    public int tribonacci(int n) {
//
//        if(n == 0)
//        {
//            return 0;
//        }
//
//        if(n == 1 || n == 2)
//        {
//            return 1;
//        }
//
//        int result [] = new int[n+1];
//        result[0] = 0;
//        result[1] = 1;
//        result[2] = 1;
//
//        for(int i = 3 ; i<=n ; i++)
//        {
//            result[i] = result[i-1] + result[i-2] + result[i-3];
//        }
//
//        return result[n];
//    }
//    //Given an integer number n, return the difference between the product of its digits and the sum of its digits.
//
//    public int subtractProductAndSum(int n) {
//        String s = String.valueOf(n);
//        int sum = 0;
//        int product = 1;
//        for(int i=0; i<s.length(); i++) {
//            int digit = Integer.parseInt(String.valueOf(s.charAt(i)));
//            sum += digit;
//            product *= digit;
//        }
//        return product - sum;
//    }
//    public List<String> stringMatching(String[] words) {
//        HashSet<String> set = new HashSet<>();
//
//        for(int i = 0; i<words.length-1; i++) {
//            String currWord = words[i];
//            for(int j = i+1; j<words.length; j++) {
//                String nextWord = words[j];
//
//                if(currWord.contains(nextWord)) {
//                    set.add(nextWord);
//                }
//
//                if(nextWord.contains(currWord)) {
//                    set.add(currWord);
//                }
//            }
//        }
//
//        List<String> res = new ArrayList<String>(set); // convert hashset to list
//        return res;
//    }
//    public int numIdenticalPairs(int[] A) {
//        int res = 0, count[] = new int[101];
//        for (int a: A) {
//            res += count[a]++;
//        }
//        return res;
//    }
//
//
//
//
//    public List<List<Integer>> fourSum(int[] nums, int target) {
//        Arrays.sort(nums);
//        return kSum(nums, target, 0, 4);
//    }
//    public List<List<Integer>> kSum(int[] nums, int target, int start, int k) {
//        List<List<Integer>> res = new ArrayList<>();
//        if (start == nums.length || nums[start] * k > target || target > nums[nums.length - 1] * k)
//            return res;
//        if (k == 2)
//            return twoSum(nums, target, start);
//        for (int i = start; i < nums.length; ++i)
//            if (i == start || nums[i - 1] != nums[i])
//                for (var set : kSum(nums, target - nums[i], i + 1, k - 1)) {
//                    res.add(new ArrayList<>(Arrays.asList(nums[i])));
//                    res.get(res.size() - 1).addAll(set);
//                }
//        return res;
//    }
//    public List<List<Integer>> twoSum(int[] nums, int target, int start) {
//        List<List<Integer>> res = new ArrayList<>();
//        int lo = start, hi = nums.length - 1;
//        while (lo < hi) {
//            int sum = nums[lo] + nums[hi];
//            if (sum < target || (lo > start && nums[lo] == nums[lo - 1]))
//                ++lo;
//            else if (sum > target || (hi < nums.length - 1 && nums[hi] == nums[hi + 1]))
//                --hi;
//            else
//                res.add(Arrays.asList(nums[lo++], nums[hi--]));
//        }
//        return res;
//    }
//    public boolean isSameTree(TreeNode p, TreeNode q) {
//        // p and q are both null
//        if (p == null && q == null) return true;
//        // one of p and q is null
//        if (q == null || p == null) return false;
//        if (p.val != q.val) return false;
//        return isSameTree(p.right, q.right) &&
//                isSameTree(p.left, q.left);
//    }
//}


