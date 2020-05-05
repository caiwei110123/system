package algorithm;

import java.util.Arrays;

/**
 * 功能描述：下一个排列
 *实现获取下一个排列的函数，算法需要将给定数字序列重新排列成字典序中下一个更大的排列。
 *
 * 如果不存在下一个更大的排列，则将数字重新排列成最小的排列（即升序排列）。
 *
 * 必须原地修改，只允许使用额外常数空间。
 *
 * 以下是一些例子，输入位于左侧列，其相应输出位于右侧列。
 * 1,2,3 → 1,3,2
 * 3,2,1 → 1,2,3
 * 1,1,5 → 1,5,1
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/next-permutation
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author : yilie
 * @date : 2020/5/2  3:26 下午
 * @Version 1.0
 */
public class nextPermutation {
    public static void main(String[] args) {
        int [] nums = new int[]{1,2,3};
        new nextPermutation().nextPermutation(nums);
        System.out.println(Arrays.toString(nums));

    }

    public void nextPermutation(int[] nums) {
        if (nums.length <= 1) return;
        if (nums.length == 2) {
            if (nums[0] < nums[1]) {
                int temp = nums[0];
                nums[0] = nums[1];
                nums[1] = temp;
                return ;
            } else {
                return ;
            }
        }
        int ii = nums.length-2; //  6
        int jj = nums.length-1; //7
        int kk = nums.length-1;
        //12385764
        //// find: A[i]<A[j]
        for (int i = nums.length-1;i>=0;i-- ) {
            if (ii>=0 && nums[ii] >= nums[jj]) {
                ii--;jj--;
            }
        }
        if (ii >=0) {
            // find: A[i]<A[k]
            while (nums[ii] >= nums[kk]) {
                kk --;
            }
            // swap A[i], A[k]
            int temp = nums[kk];
            nums[kk] = nums[ii];
            nums[ii] = temp;
        }
        //1 2 3 4 5 6 7 8
        // reverse A[j:end]
        if (ii < jj) {
            int[] subNums = new int[nums.length - jj];
            System.arraycopy(nums, jj, subNums, 0, nums.length - jj);
            Arrays.sort(subNums);
            for (int i = jj; i < nums.length; i++) {
                nums[i] = subNums[i - jj];
            }
        }
    }
}
