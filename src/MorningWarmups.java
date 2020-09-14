import java.awt.image.ImageProducer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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
    }



