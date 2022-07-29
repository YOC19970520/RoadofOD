package Stack;

import java.util.Queue;

import com.sun.jmx.remote.internal.ArrayQueue;

public class MyStack {
  ArrayQueue<Integer> q = new ArrayQueue<Integer>(10);
  public MyStack() {

  }

  public void push(int x) {
    q.add(x);
  }

  public int pop() {
    int size = q.size();
    return q.get(size-1);
  }

  public int top() {
    int size = q.size();
    return q.get(size-1);
  }

  public boolean empty() {
  return q.isEmpty();
  }
}
