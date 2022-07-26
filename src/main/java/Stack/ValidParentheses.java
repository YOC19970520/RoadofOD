package Stack;

import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
    process();
    }

    static boolean process(){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char c : chars) {
            stack.push(c);
        }

        if (chars.length%2 == 1){
            return false;
        }

        
        return true;
    }
}
