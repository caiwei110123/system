package algorithm;





/**
 * 功能描述：寻找两个有序数组的中位数
 *
 *  给定两个大小为 m 和 n 的有序数组 nums1 和 nums2。
 * 请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。
 * 你可以假设 nums1 和 nums2 不会同时为空。
 * 示例 1:
 * nums1 = [1, 3]
 * nums2 = [2]
 *
 * 则中位数是 2.0
 * 示例 2:
 * nums1 = [1, 2]
 * nums2 = [3, 4]
 *
 * 则中位数是 (2 + 3)/2 = 2.5
 * @author : yilie
 * @date : 2020/4/28  5:07 下午
 * @Version 1.0
 */
public class findMedianSortedArrays {
    public static void main(String[] args) {
        //[1,4,5,16,7,2,66,77,8,9,3]
        //[2,4,5,16,3,1,33,44,55,3,6]
        int [] num1  = new int[]{1,2,3,8,9,10,11};
        int [] num2  = new int[]{1,2,3,4,5,6,7,8,9};

        System.out.println(new findMedianSortedArrays().findMedianSortedArrays(num1,num2));
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int size = len1 + len2;
        // 中位数只有一个
        if(size % 2 == 1) {
            return findKth(nums1, 0, len1, nums2, 0, len2, size / 2 + 1);
        } else {
            double p1 = findKth(nums1, 0, len1, nums2, 0, len2, size / 2);
            double p2 = findKth(nums1, 0, len1, nums2, 0, len2, size / 2 + 1);
            System.out.println("p1="+p1+"    p1="+p2);
            //有两个中位数，所以分别获取了2个后相除
            return (p1 +p2 )/2;
        }
    }

    public double findKth(int[] nums1, int start1, int len1, int[] nums2, int start2, int len2, int k)
    {
        // 两个数组中有效数据判断没，小的在前
        if(len1 - start1 > len2 -start2)
            return findKth(nums2, start2, len2, nums1, start1, len1, k);

        // 在极端情况下，第一个数组已经到了最后了，可是第二个数组还有很多数据，直接取第二个中间的
        if(len1 - start1 == 0)
            return nums2[k - 1];

        if(k == 1)
            return Math.min(nums1[start1], nums2[start2]);
        // k==1表示已经找到第k-1小的数，下一个数为两个数组start开始的最小值
        //随着一个数组 start 的变化，求数组中间的一个数的索引
        int p1 = start1 + Math.min(len1 - start1, k / 2);  //p1和p2记录当前需要比较的那个位

        int p2 = start2 + k - p1 + start1;

        if(nums1[p1 - 1] < nums2[p2 - 1])
            return findKth(nums1,  p1, len1, nums2, start2, len2, k - p1 + start1);
        else if(nums1[p1 - 1] > nums2[p2 -1])
            return findKth(nums1, start1, len1, nums2, p2, len2, k - p2 + start2);
        else
            return nums1[p1 - 1];
    }
}
