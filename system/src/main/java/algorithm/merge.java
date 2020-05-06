package algorithm;

import java.util.Arrays;

/**
 * 功能描述：合并两个有序数组
 *给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。
 *
 *  
 *
 * 说明:
 *
 * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n 。
 * 你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
 *  
 *
 * 示例:
 *
 * 输入:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 *
 * 输出: [1,2,2,3,5,6]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/merge-sorted-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author : yilie
 * @date : 2020/4/30  4:09 下午
 * @Version 1.0
 */
public class merge {

    public static void main(String[] args) {
        new merge().merge(new int[]{1,2,3,0,0,0},3,new int[]{2,5,6},3);
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int p = m + n - 1;

        while ((p1 >= 0) && (p2 >= 0)){
            System.out.println(1);
            if (nums1[p1] < nums2[p2]) {
                nums1[p]  = nums2[p2];
                p2--;
            } else {
                nums1[p]  = nums1[p1];
                p1--;
            }
            p--;
        }
        System.arraycopy(nums2, 0, nums1, 0, p2 + 1);
        System.out.println(Arrays.toString(nums1));

    }
}
