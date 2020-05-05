package algorithm;

import java.util.Stack;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2020/5/4  3:25 下午
 * @Version 1.0
 */
class MyQueue {

    Stack<Integer> s2 = new Stack<>();
    Stack<Integer> s1 = new Stack<>();
    int front = 0;
    /** Initialize your data structure here. */
    public MyQueue() {

    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        if (s1.isEmpty()) {
            front = x;
        }
        s1.add(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if (s2.isEmpty()) {
            while(!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }

    /** Get the front element. */
    public int peek() {
        if (!s2.isEmpty()) {
            return s2.peek();
        }
        return front;
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return s1.isEmpty() && s2.isEmpty();
    }

    public static void main(String[] args) {
          MyQueue obj = new MyQueue();
          obj.push(5);
        obj.push(4);
        obj.push(3);
        obj.push(2);
        obj.push(1);

          int param_2 = obj.pop();
          int param_3 = obj.peek();
         boolean param_4 = obj.empty();
    }
}

