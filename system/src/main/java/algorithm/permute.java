package algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2020/5/1  8:50 下午
 * @Version 1.0
 */
public class permute {

    public static void main(String[] args) {
        new permute().permute(new int[]{1,2,3});
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new LinkedList();

        ArrayList<Integer> output = new ArrayList<Integer>();
        for (int num : nums){
            output.add(num);
        }
        int n = nums.length;
        backtrack(n, output, res, 0);
        return res;
    }
    public void backtrack(int n,
                          ArrayList<Integer> output,
                          List<List<Integer>> res,
                          int first) {
        // 所有数都填完了
        if (first == n)
            res.add(new ArrayList<Integer>(output));
        for (int i = first; i < n; i++) {
            // 动态维护数组
            //  System.out.println(first+"  begin  "+i+"    "+output);
            Collections.swap(output, first, i);
            // System.out.println(first+"  end  "+i+"    "+output);
            // 继续递归填下一个数
            backtrack(n, output, res, first + 1);
            // 撤销操作
            Collections.swap(output, first, i);
        }
    }
}
