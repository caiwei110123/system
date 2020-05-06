package algorithm;

import java.util.PriorityQueue;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2020/5/7  12:55 上午
 * @Version 1.0
 */
public class findKthLargest {

    public static void main(String[] args) {
        new findKthLargest().findKthLargest(new int[] {3,2,1,5,6,4}, 2);
    }

    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> heap =
            new PriorityQueue<Integer>((n1, n2) -> n1 - n2);
        for (int n : nums) {
            heap.add(n);
            if (heap.size() > k) {

                heap.poll();
            }

        }
        return heap.poll();
    }
}