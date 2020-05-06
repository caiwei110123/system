package algorithm;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2020/5/7  1:21 上午
 * @Version 1.0
 */
public class searchInsert {

    public static void main(String[] args) {
        new searchInsert().searchInsert(new int[]{1,3,5,6},5);
    }
    public int searchInsert(int[] nums, int target) {
        int l = 0;int r = nums.length-1;
        while(l < r) {
            int mid = l+ (r-l)/2;
            System.out.println(nums[mid] +"   "+ target);
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] <  target) {
                l = mid + 1;
            } else if (nums[mid] >=  target){
                r = mid -1;
            }
        }
        return l +1;
    }
}
