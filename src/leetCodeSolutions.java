import java.util.*;
import java.lang.*;

public class leetCodeSolutions {
    //this Class is for writing at least one method a day.
    public static void main(String[] args) {
//
//        int[] nums = {4, 9, 25, 14, 100, 66, 666, 1};
//        int target = 125;
//        System.out.println(Arrays.toString(twoSum(nums, target)));
//
//        System.out.println(isPositive(-4));
//        System.out.println(isPositive(5));
//        System.out.println(isOdd(6));
        // System.out.println(isPositiveOdd(5)
        //System.out.println(isMultipleOf3(9));
      //  System.out.println(isVowel("u"));

        System.out.println(findTheDifference("xxxxy", "xxxx"));



    }

    // given an array of integers, find the index of the two numbers that will return
// the targeted number.
    public static int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length < 2)
            return new int[]{0, 0};

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return new int[]{map.get(nums[i]), i};
            } else {
                map.put(target - nums[i], i);
            }
        }


        return new int[]{0, 0};
    }
//

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        ArrayList<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            int k = nums.length - 1;

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            while (j < k) {
                if (k < nums.length - 1 && nums[k] == nums[k + 1]) {
                    k--;
                    continue;
                }

                if (nums[i] + nums[j] + nums[k] > 0) {
                    k--;
                } else if (nums[i] + nums[j] + nums[k] < 0) {
                    j++;
                } else {
                    ArrayList<Integer> l = new ArrayList<>();
                    l.add(nums[i]);
                    l.add(nums[j]);
                    l.add(nums[k]);
                    result.add(l);
                    j++;
                    k--;
                }
            }
        }

        return result;
    }
//    We have two special characters.
//    The first character can be represented by one bit 0.
//    The second character can be represented by two bits (10 or 11).
//
//    Now given a string represented by several bits.
//    Return whether the last character must be a one-bit character or not.
//    The given string will always end with a zero.

    public boolean isOneBitCharacter(int[] bits) {
        int i = 0;
        while (i < bits.length - 1) {
            i += bits[i] + 1;
        }
        return i == bits.length - 1;
    }

    //
//    You are given two non-empty linked lists representing two non-negative integers.
//    The digits are stored in reverse order and each of their nodes contain a single digit.
//    Add the two numbers and return it as a linked list.
//
//    You may assume the two numbers do not contain any leading zero, except the number 0 itself.
//
//            Example:
//
//    Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
//    Output: 7 -> 0 -> 8
//    Explanation: 342 + 465 = 807.
//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        ListNode dummyHead = new ListNode(0);
//        ListNode p = l1, q = l2, curr = dummyHead;
//        int carry = 0;
//        while (p != null || q != null) {
//            int x = (p != null) ? p.val : 0;
//            int y = (q != null) ? q.val : 0;
//            int sum = carry + x + y;
//            carry = sum / 10;
//            curr.next = new ListNode(sum % 10);
//            curr = curr.next;
//            if (p != null) p = p.next;
//            if (q != null) q = q.next;
//        }
//        if (carry > 0) {
//            curr.next = new ListNode(carry);
//        }
//        return dummyHead.next;
//    }
//    }
    class Solution {
        public boolean checkStraightLine(int[][] coordinates) {
            int[] point1 = coordinates[1];
            int[] point2 = coordinates[0];
            float gSlope = slope(point1, point2);

            for (int i = 1; i < coordinates.length; i++) {
                int[] p1 = coordinates[i];
                int[] p2 = coordinates[0];
                float slop = slope(p1, p2);
                if (gSlope != slop) return false;
            }
            return true;
        }

        private float slope(int[] p1, int[] p2) {
            if ((p1[0] - p2[0]) == 0) return 0;
            return (float) (p2[1] - p1[1]) / (p2[0] - p1[0]);
        }
    }


    public int removeDuplicates(int[] nums) {

        int length = nums.length;

        if (length == 0)
            return 0;

        int i;
        int targetIndex = 1;
        int OG = nums[0];

        for (i = 1; i < length; i++) {

            if (nums[i] != OG) {

                OG = nums[i];
                nums[targetIndex] = nums[i];
                targetIndex++;
            }
        }

        return targetIndex;

    }

    //if perfect square, return true, else false
    public boolean isPerfectSquare(int num) {
        double s = Math.sqrt(num);
        return s == (int) s;
    }


    //if palendrone, return true
    public boolean isPalindromeRange(String s, int i, int j) {
        for (int k = i; k <= i + (j - i) / 2; k++) {
            if (s.charAt(k) != s.charAt(j - k + i)) return false;
        }
        return true;
    }

    public boolean validPalindrome(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                int j = s.length() - 1 - i;
                return (isPalindromeRange(s, i + 1, j) ||
                        isPalindromeRange(s, i, j - 1));
            }
        }
        return true;
    }

    public String longestWord(String[] words) {
        String ans = "";
        Set<String> wordset = new HashSet();
        for (String word : words) wordset.add(word);
        for (String word : words) {
            if (word.length() > ans.length() ||
                    word.length() == ans.length() && word.compareTo(ans) < 0) {
                boolean good = true;
                for (int k = 1; k < word.length(); ++k) {
                    if (!wordset.contains(word.substring(0, k))) {
                        good = false;
                        break;
                    }
                }
                if (good) ans = word;
            }
        }
        return ans;
    }


    // Given an array nums with n objects colored red, white, or blue,
    // sort them in-place so that objects of the same color are adjacent,
    // with the colors in the order red, white, and blue.
    public void sortColors(int[] nums) {
        // 0 to j-1--> 0 Area
        // k+1 to end --> 2's Area
        //j to i-1-->1's Area
        //i to k-1--> Unknown Area
        // Source -->Pepcoding youtube channel
        int i = 0, j = 0, k = nums.length - 1;
        while (i <= k) {
            if (nums[i] == 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j++;
            } else if (nums[i] == 1) {
                i++;
            } else {
                int temp = nums[i];
                nums[i] = nums[k];
                nums[k] = temp;
                k--;
            }
        }
    }

    //takes in a matrix and rotates the numbers
    public void rotate(int[][] matrix) {
        int size = matrix.length;
        int[][] res = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = size - 1; j >= 0; j--) {
                res[i][size - j - 1] = matrix[j][i];
            }
        }
        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++)
                matrix[i][j] = res[i][j];
    }

    //Given a string, find the first non-repeating character in it and return its index. If it doesn't exist, return -1.
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> count = new HashMap<Character, Integer>();
        int n = s.length();
        // build hash map : character and how often it appears
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            count.put(c, count.getOrDefault(c, 0) + 1);
        }

        // find the index
        for (int i = 0; i < n; i++) {
            if (count.get(s.charAt(i)) == 1)
                return i;
        }
        return -1;
    }
    //find the winner in tic tac toe game

    //    Given an array moves where each element is another array of size 2 corresponding to the row and column of the grid where they mark their respective character in the order in which A and B play.
//
//    Return the winner of the game if it exists (A or B), in case the game ends in a draw return "Draw", if there are still movements to play return "Pending".
//
//    You can assume that moves is valid (It follows the rules of Tic-Tac-Toe), the grid is initially empty and A will play first.
    public String tictactoe(int[][] moves) {
        int j = 0;
        char tictoc[][] = new char[3][3];
        while (j < moves.length) {
            if (j % 2 == 0) {
                tictoc[moves[j][0]][moves[j][1]] = 'X';
            } else {
                tictoc[moves[j][0]][moves[j][1]] = 'O';
            }
            j++;
        }
        String b = checkwinner(tictoc);
        if (b == null) {
            if (j == 9) //no moves possible
            {
                return "Draw";
            } else {
                return "Pending";
            }
        }

        return b;
    }

    public String checkwinner(char[][] arr) {
        //check rows
        for (int i = 0; i < 3; i++) {

            if (arr[i][0] == arr[i][1] && arr[i][1] == arr[i][2]) {
                if (arr[i][0] == 'X')
                    return "A";
                else if (arr[i][0] == 'O')
                    return "B";
            }
        }
        //check cols
        for (int i = 0; i < 3; i++) {

            if (arr[0][i] == arr[1][i] && arr[1][i] == arr[2][i]) {
                if (arr[0][i] == 'X')
                    return "A";
                else if (arr[0][i] == 'O')
                    return "B";
            }
        }
        //check diagonal 1

        if (arr[0][0] == arr[1][1] && arr[1][1] == arr[2][2]) {
            if (arr[0][0] == 'X')
                return "A";
            else if (arr[0][0] == 'O')
                return "B";
        }

        //check diagonal 2
        if (arr[0][2] == arr[1][1] && arr[1][1] == arr[2][0]) {
            if (arr[0][2] == 'X')
                return "A";
            else if (arr[0][2] == 'O')
                return "B";
        }
        return null; //return null if no winner found

    }
//    Given two integer arrays of equal length target and arr.
//
//    In one step, you can select any non-empty sub-array of arr and reverse it. You are allowed to make any number of steps.
//
//    Return True if you can make arr equal to target, or False otherwise.

    public static boolean isPositive(int num) {

        boolean result = false;

        if (num >= 0) {
            result = true;
        } else if (num < 0) {
            result = false;
        }
        return result;
    }

    public static boolean isOdd(int num) {
        boolean result = false;

        if (num % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean isPositiveOdd(int n) {

        if ((n >= 0) && (n % 2 == 1)) {
            return true;
        } else { // other cases
            return false;
        }
    }

    public static boolean isMultipleOf3(int n) {
        if (n % 3 == 0) {
            return true;
        } else {
            return false;
        }
    }

        public static boolean isVowel (String s){
            return "AEIOUaeiou".contains(s);
        }


//    We need to quickly compute the sum of values to the left and the right of every index.
//
//    Let's say we knew S as the sum of the numbers, and we are at index i.
//    If we knew the sum of numbers leftsum that are to the left of index i,
//    then the other sum to the right of the index would just be S - nums[i] - leftsum.
//
//    As such, we only need to know about leftsum to check whether an index is a pivot index in constant time.
//    Let's do that: as we iterate through candidate indexes i, we will maintain the correct value of leftsum.


    public int pivotIndex(int[] nums) {
        int sum = 0, leftsum = 0;
        for (int x: nums) sum += x;
        for (int i = 0; i <nums.length; ++i) {
            if (leftsum == sum - leftsum - nums[i]) return i;
            leftsum += nums[i];
        }
        return -1;




    }

//        As we know possible range of chars and it's small - only english lowercase letters which is 26 - we can use
//        preallocated array that will keep count of every char. '
//        We need to use count of every char because this is what stays constant after permutation of the original string.
//        Scan the original string and increment count of every char. Index of the count can be calculated as
//        "char - 'a'" which gives range [0...25].
//        Do the second scan of the t (processed) string, for each character decrement it's count from the array of counts.
//        Three cases are possible:
//        char has only change place, count will be the same between two strings, at the end count array will have 0 for
//        this char.
//                example is char "a" in s="aabd" and t="adbat", count will be 2 after scaning of s and 0 after scaning of t
//
//        one of existing characters has been added to t, in this case count array will have count_of_char, but t will
//        have count_of_char + 1. if we decrement the count at the end we'll have -1 for this char.
//        example is char "a" in s="aabd" and t="adaba", count will be 2 after scaning of s and -1 after scaning of t
//
//        some character that was not present in original string has been added. in such case count array will have 0 for
//        this char, and when we decrement the count at the end we'll have -1 for this char.
//        example is char "t" in s="aabd" and t="adabt", count will be 0 after scaning of s and -1 after scaning of t
//
//        It should be obvious at this point that the char that has been added will produce -1 during the scanning of t string.
//        We need to check the count after every one character has been processed and return the character that caused this -1 count.
//
//                O(n) time - scan both string once, O(n) + O(n + 1) gives as O(n)
//        O(1) space - array is preallocated (with length 26) and thus does not depend on size of the input.
//

    public static char findTheDifference(String s, String t) {
        int[] counts = new int[26];
        for (char ch : s.toCharArray()) {
            ++counts[ch-'a'];
        }
        for (char ch : t.toCharArray()) {
            --counts[ch - 'a'];
            if (counts[ch - 'a'] < 0)
                return ch;
        }
        return ' ';
    }


//    To be specific, your design should include these functions:
//
//    add(value): Insert a value into the HashSet.
//    contains(value) : Return whether the value exists in the HashSet or not.
//    remove(value): Remove a value in the HashSet. If the value does not exist in the HashSet, do nothing.

    public int fib(int N) {
        //Fibonacci
        if (N <=1) {
            return N;
        }
        return fib (N-1) + fib (N-2);
    }
//    A boomerang is a set of 3 points that are all distinct and not in a straight line.
//
//    Given a list of three points in the plane, return whether these points are a boomerang.


    public boolean isBoomerang(int[][] points) {
        int x1 ,x2,y1,y2,x3,y3 ;
        //get first points coordinates
        x1=points[0][0];
        y1=points[0][1];
        //get second point coordinates;
        y2=points[1][1];
        x2=points[1][0];
        //get third point coordinates
        x3 = points[2][0];
        y3=points[2][1];

        return !((y2-y1) * (x3-x2) == (y3-y2)* (x2-x1));
    }
    public String reverseWords(String s) {
        String words[] = s.split(" ");
        StringBuilder res=new StringBuilder();
        for (String word: words)
            res.append(new StringBuffer(word).reverse().toString() + " ");
        return res.toString().trim();
    }
    public boolean validMountainArray(int[] A) {
        int N = A.length;
        int i = 0;

        // walk up
        while (i+1 < N && A[i] < A[i+1])
            i++;

        // peak can't be first or last
        if (i == 0 || i == N-1)
            return false;

        // walk down
        while (i+1 < N && A[i] > A[i+1])
            i++;

        return i == N-1;
    }


}






