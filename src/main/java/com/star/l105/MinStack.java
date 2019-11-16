package com.star.l105;

import java.util.Stack;

/**
 * @author star
 * @Date 2019/11/16.
 * @Description: No Description Yet.
 *
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

    push(x) -- Push element x onto stack.
    pop() -- Removes the element on top of the stack.
    top() -- Get the top element.
    getMin() -- Retrieve the minimum element in the stack.

    来源：力扣（LeetCode）
    链接：https://leetcode-cn.com/problems/min-stack
    著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

    解题关键点：
    1.要维护最小值，每次入栈和出栈都需要更新minVal,为了维护方便stack中存储于入栈时的minval的差值。
    2.求和会产生int溢出，使用long
 */
public class MinStack {
  private Stack<Long> s;
  private long minVal = 0;

  public static void main(String[] args) {
    MinStack ms = new MinStack();
    ms.push(-1);

    System.out.println(ms.top());
    System.out.println(ms.getMin());
  }

  /** initialize your data structure here. */
  public MinStack() {
     s = new Stack<>();
  }

  public void push(int x) {
    if (s.isEmpty()) {
      s.push(0L);
      minVal = x;
    }else {
      s.push(x - minVal);
      if (x < minVal) minVal = x;
    }
  }

  public void pop() {
    if (s.isEmpty()) return;
    long x = s.pop();
    if (x < 0) minVal = minVal - x;
  }

  public int top() {
    long x = s.peek();
    if (x >= 0) return (int)(minVal + x);
    else return (int)minVal;
  }

  public int getMin() {
    return (int)minVal;
  }
}
