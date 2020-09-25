import java.awt.image.ImageProducer;
import java.util.*;

public class MorningWarmups {
//this Class is for writing at least one method a day.
public static void main(String[] args) {

    int[] nums = { 4, 9, 25, 14, 100, 66, 666, 1 };
    int target = 125;
    System.out.println(Arrays.toString(twoSum(nums, target)));



}
// given an array of integers, find the index of the two numbers that will return
// the targeted number.
    public static int[] twoSum(int[] nums, int target) {
        if(nums==null || nums.length<2)
            return new int[]{0,0};

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                return new int[]{map.get(nums[i]), i};
            }else{
                map.put(target-nums[i], i);
            }
        }


        return new int[]{0,0};
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
        return (float)(p2[1] - p1[1]) / (p2[0] - p1[0]);
    }
}


        public int removeDuplicates(int[] nums) {

            int length = nums.length;

            if(length == 0)
                return 0;

            int i;
            int targetIndex = 1;
            int OG = nums[0];

            for(i = 1; i < length; i++){

                if(nums[i] != OG){

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
        return s == (int)s;
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
                return (isPalindromeRange(s, i+1, j) ||
                        isPalindromeRange(s, i, j-1));
            }
        }
        return true;
    }
        public String longestWord(String[] words) {
            String ans = "";
            Set<String> wordset = new HashSet();
            for (String word: words) wordset.add(word);
            for (String word: words) {
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
        int i=0,j=0,k=nums.length-1;
        while(i<=k){
            if(nums[i]==0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                j++;
            }else if(nums[i]==1){
                i++;
            }else{
                int temp=nums[i];
                nums[i]=nums[k];
                nums[k]=temp;
                k--;
            }
        }
    }
}



//learn about Listnodes


