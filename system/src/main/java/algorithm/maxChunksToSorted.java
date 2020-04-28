package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 功能描述：
 *数组arr是[0, 1, ..., arr.length - 1]的一种排列，
 * 我们将这个数组分割成几个“块”，并将这些块分别进行排序。
 * 之后再连接起来，使得连接的结果和按升序排序后的原数组相同。我们最多能将数组分成多少块？
 *
 * 输入: arr = [1,0,2,3,4]
 * 输出: 4
 * 解释:
 * 我们可以把它分成两块，例如 [1, 0], [2, 3, 4]。
 * 然而，分成 [1, 0], [2], [3], [4] 可以得到最多的块数。
 *
 *
 *
 * 输入: arr = [4,3,2,1,0]
 * 输出: 1
 * 解释:
 * 将数组分成2块或者更多块，都无法得到所需的结果。
 * 例如，分成 [4, 3], [2, 1, 0] 的结果是 [3, 4, 0, 1, 2]，这不是有序的数组。
 * @author : yilie
 * @date : 2020/4/28  9:08 下午
 * @Version 1.0
 */
   public class maxChunksToSorted {

    public static void main(String[] args) {
        System.out.println(new maxChunksToSorted().maxChunksToSorted(new int[]{1,0,2,3,4}));
    }
    public int maxChunksToSorted(int [] arr) {
        int maxV = arr[0];
        int count = 0;
        for (int i = 0;i < arr.length; i++) {
            int max = Math.max(arr[i],maxV);
            if (max <= i) {
                count ++ ;
            }
        }
        return count;
    }


    //public int maxChunksToSorted(int[] arr) {
    //    int max = 0, count = 0;
    //    for(int i = 0; i < arr.length; i++){
    //        max = Math.max(max, arr[i]);
    //        if(max <= i) {
    //            count++;
    //        }
    //    }
    //    return count;
    //}
    //public int maxChunksToSorted(int[] arr) {
    //    ArrayList<Integer> front = new ArrayList<>();
    //    int count = 0;
    //    for(int i = 0; i < arr.length; i++){
    //        front.add(arr[i]);
    //        boolean flag = true;
    //        for(int num : front){
    //            if(num > i){
    //                flag = false;
    //            }
    //        }
    //        System.out.println(front);
    //
    //        if(flag){
    //            count++;
    //            front.clear();
    //        }
    //    }
    //    return count;
    //}

    //public int maxChunksToSorted(int[] arr) {
    //    if(arr ==null){
    //        return 0;
    //    }
    //    int ret = 0;
    //    int max =arr[0];
    //    for(int i=0;i< arr.length;i++){
    //        System.out.println();
    //        max = Math.max(max,arr[i]);
    //
    //        if(max==i){
    //            ret++;
    //        }
    //        System.out.println("i="+i+"     max = "+max+"    ret="+ret);
    //    }
    //    return ret;
    //}

    }
