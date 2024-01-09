package prac3;

import java.util.Stack;

public class parenthisBalancing {

    public static void main(String[] args) {

        if (check("{[()]}")) {
            System.out.println("String is balanced parenthesis");
        } else {
            System.out.println("String is not balanced parenthesis");
        }
    }

    public static boolean check(String str) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char x = str.charAt(i);

            if (x == '{' || x == '(' || x == '[') {
                stack.push(x);
                continue;
            }

            if (stack.isEmpty()) {
                return false;
            }

            char check;

            switch (x) {
                case ')':
                    check = stack.pop();
                    if (check == '{' || check == '[') {
                        return false;
                    }
                    break;
                case '}':
                    check = stack.pop();
                    if (check == '(' || check == '[') {
                        return false;
                    }
                    break;
                case ']':
                    check = stack.pop();
                    if (check == '{' || check == '(') {
                        return false;
                    }
                    break;

            }
        }

        return (stack.isEmpty());
    }

}
