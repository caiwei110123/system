package algorithm;

import java.util.Stack;

/**
 * 功能描述：接雨水
 *给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水。
 * 上面是由数组 [0,1,0,2,1,0,1,3,2,1,2,1] 表示的高度图，在这种情况下，可以接 6 个单位的雨水（蓝色部分表示雨水）。 感谢 Marcos 贡献此图。
 *
 * 示例:
 *输入: [0,1,0,2,1,0,1,3,2,1,2,1]
 * 输出: 6
 * @author : yilie
 * @date : 2020/4/30  10:10 上午
 * @Version 1.0
 */
public class trap6 {
    public int trap6(int[] height) {
        int sum = 0;
        Stack<Integer> stack = new Stack<>();
        int current = 0;
        while (current < height.length) {
            //如果栈不空并且当前指向的高度大于栈顶高度就一直循环
            while (!stack.empty() && height[current] > height[stack.peek()]) {
                int h = height[stack.peek()]; //取出要出栈的元素
                stack.pop(); //出栈
                if (stack.empty()) { // 栈空就出去
                    break;
                }
                 int distance = current - stack.peek() - 1; //两堵墙之前的距离。
                int min = Math.min(height[stack.peek()], height[current]);
                System.out.println(distance+"   "+min+"    "+h);
                sum = sum + distance * (min - h);
            }
            stack.push(current); //当前指向的墙入栈
            current++; //指针后移
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(new trap6().trap6(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
    }
}
