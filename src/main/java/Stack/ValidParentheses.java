package Stack;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class ValidParentheses {
  public static void main(String[] args) {
    boolean process = process();
    System.out.println(process);
  }

  static boolean process() {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    char[] chars = s.toCharArray();
    int l = chars.length;

    if (l % 2 == 1) {
      return false;
    }
    HashMap<Character, Character> pairs = new HashMap<>();
    pairs.put(')', '(');
    pairs.put('}', '{');
    pairs.put(']', '[');

    Deque<Character> stack = new LinkedList<>();
    for (int i = 0; i < l; i++) {
      if (pairs.containsKey(chars[i])) {
        if (stack.isEmpty() || stack.peek() != pairs.get(chars[i])) {
          return false;
        }
        stack.pop();
      } else {
        stack.push(chars[i]);
      }
    }
    return stack.isEmpty();
  }
}
