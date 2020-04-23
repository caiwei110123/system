package tree.demo3;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2019/12/4  下午3:21
 * @Version 1.0
 */
import java.util.Arrays;
/*给定一个数组，求如果排序之后，相邻两数的最大差值，要求： 时间复杂度O(N)，且要求不能用非基于比较的排序。*/
public class MaxGap {

    public static int maxGap(int[] nums) {
        if (nums == null || nums.length < 2) {
            return 0;
        }
        int len = nums.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        //获取数组中的最大值和最小值,主要目的是方便后续算出数组中的数进入哪个桶
        for (int i = 0; i < len; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }
        //数组中的数都相等
        if (min == max) {
            return 0;
        }

        //len个数字,创建len+1个桶
        //至少存在一个空桶，空桶的含义是证明最大差值一定不来自于相同桶内的数
        boolean[] hasNum = new boolean[len + 1];
        int[] maxs = new int[len + 1];
        int[] mins = new int[len + 1];
        int bid = 0;
        //把值放入桶内并得到最大值和最小值
        for (int i = 0; i < len; i++) {
            //得到arr[i]对应放入桶的位置bid
            bid = bucket(nums[i], len, min, max);
            //得到每一个桶的最小值
            mins[bid] = hasNum[bid] ? Math.min(mins[bid], nums[i]) : nums[i];
            //得到每一个桶的最大值
            maxs[bid] = hasNum[bid] ? Math.max(maxs[bid], nums[i]) : nums[i];
            hasNum[bid] = true;
        }
        int res = 0;
        int lastMax = maxs[0];
        int i = 1;
        for (; i <= len; i++) {
            if (hasNum[i]) {
                res = Math.max(res, mins[i] - lastMax);
                lastMax = maxs[i];
            }
        }
        return res;
    }

    public static int bucket(long num, long len, long min, long max) {
        return (int) ((num - min) * len / (max - min));
    }

    // for test
    public static int comparator(int[] nums) {
        if (nums == null || nums.length < 2) {
            return 0;
        }
        Arrays.sort(nums);
        int gap = Integer.MIN_VALUE;
        for (int i = 1; i < nums.length; i++) {
            gap = Math.max(nums[i] - nums[i - 1], gap);
        }
        return gap;
    }

    // for test
    public static int[] generateRandomArray(int maxSize, int maxValue) {
        int[] arr = new int[(int) ((maxSize + 1) * Math.random())];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((maxValue + 1) * Math.random()) - (int) (maxValue * Math.random());
        }
        return arr;
    }

    // for test
    public static int[] copyArray(int[] arr) {
        if (arr == null) {
            return null;
        }
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[i];
        }
        return res;
    }

    // for test
    public static void main(String[] args) {
        int testTime = 500000;
        int maxSize = 100;
        int maxValue = 100;
        boolean succeed = true;
        for (int i = 0; i < testTime; i++) {
            int[] arr1 = generateRandomArray(maxSize, maxValue);
            int[] arr2 = copyArray(arr1);
            System.out.println(maxGap(arr1)+"    "+ comparator(arr2));
            if (maxGap(arr1) != comparator(arr2)) {
                succeed = false;
                break;
            }
        }
        System.out.println(succeed);
        System.out.println(succeed ? "Nice!" : "Fucking fucked!");
    }

}