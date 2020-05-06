package algorithm;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2020/5/7  2:23 上午
 * @Version 1.0
 */
public class findDisappearedNumbers {
    public static void main(String[] args) {
        System.out.println(4^0);
        System.out.println(5^1);
        new findDisappearedNumbers().findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1});
    }
    public List<Integer> findDisappearedNumbers(int[] nums) {
        System.out.println(Arrays.toString(nums));

        for (int i = 0; i < nums.length; i++) {

            int newIndex = Math.abs(nums[i]) - 1;
            if (nums[newIndex] > 0) {
                nums[newIndex] *= -1;
            }
        }
        System.out.println(Arrays.toString(nums));

        List<Integer> result = new LinkedList<Integer>();

        for (int i = 1; i <= nums.length; i++) {
            if (nums[i - 1] > 0) {
                result.add(i);
            }
        }
        return result;
    }
}
