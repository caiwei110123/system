package algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 功能描述： 最多能完成排序的块 II
 *这个问题和“最多能完成排序的块”相似，但给定数组中的元素可以重复，输入数组最大长度为2000，其中的元素最大为10**8。
 *
 * arr是一个可能包含重复元素的整数数组，我们将这个数组分割成几个“块”，并将这些块分别进行排序。之后再连接起来，使得连接的结果和按升序排序后的原数组相同。
 *
 * 我们最多能将数组分成多少块？
 *
 *
 * 输入: arr = [5,4,3,2,1]
 * 输出: 1
 * 解释:
 * 将数组分成2块或者更多块，都无法得到所需的结果。
 * 例如，分成 [5, 4], [3, 2, 1] 的结果是 [4, 5, 1, 2, 3]，这不是有序的数组。
 *
 * 输入: arr = [2,1,3,4,4]
 * 输出: 4
 * 解释:
 * 我们可以把它分成两块，例如 [2, 1], [3, 4, 4]。
 * 然而，分成 [2, 1], [3], [4], [4] 可以得到最多的块数。
 *
 * arr的长度在[1, 2000]之间。
 * arr[i]的大小在[0, 10**8]之间。
 *
 * @author : yilie
 * @date : 2020/4/28  9:08 下午
 * @Version 1.0
 */
class maxChunksToSorted2 {
    public static void main(String[] args) {
        System.out.println(new maxChunksToSorted2().maxChunksToSorted(new int[]{2,1,3,4,4}));
    }
    public static int maxChunksToSorted(int[] arr) {
        int len = arr.length;
        //存从左往右最大值,每个位置都存
        int[] leftmax = new int[len];
        //存从右往左最小值
        int[] rightmin = new int[len];
        int count = 1;
        leftmax[0] = arr[0];
        rightmin[len - 1] = Integer.MAX_VALUE;
        for (int i = 1; i < len; i++) {
            leftmax[i] = Math.max(leftmax[i - 1], arr[i]);
        }

        //每个i位置存的是i+1以后的最大值
        for (int j = len - 2; j >= 0; j--) {
            rightmin[j] = Math.min(rightmin[j + 1], arr[j + 1]);
        }

        for (int index = 0; index < len - 1; index++) {
            if (leftmax[index] <= rightmin[index]) {
                count++;
            }
        }
        return count;
    }
}