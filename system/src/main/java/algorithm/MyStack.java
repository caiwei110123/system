package algorithm;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2020/5/4  3:03 下午
 * @Version 1.0
 */
class MyStack {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();
    int top = 0;
    /** Initialize your data structure here. */
    public MyStack() {

    }

    /** Push element x onto stack. */
    public void push(int x) {
        q2.add(x);
        top = x;
        while(!q1.isEmpty()) {
            q2.add(q1.remove());
        }
        Queue<Integer>temp = q1;
        q1 = q2;
        q2 = temp;


    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        q1.remove();
        int res = top;
        if (!q1.isEmpty()) {
            top = q1.peek();
        }
        return res;

    }

    /** Get the top element. */
    public int top() {
        return top;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return q1.isEmpty();
    }

    public static void main(String[] args) {
          MyStack obj = new MyStack();
          obj.push(1);
          obj.push(2);
          obj.push(3);
          obj.push(4);
          obj.push(5);
          int param_2 = obj.pop();
          int param_3 = obj.top();
          boolean param_4 = obj.empty();
    }
}

