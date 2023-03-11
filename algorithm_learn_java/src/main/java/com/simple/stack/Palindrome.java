package com.simple.stack;

import static org.apache.commons.lang3.StringUtils.isBlank;

/**
 * @Author Simple
 * @Create 2023/3/9 14:12
 * @Description 回文判断
 */
public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("aba"));
        System.out.println(isPalindrome("simple"));
        System.out.println(isPalindrome("acabaca"));
    }

    public static boolean isPalindrome(String str) {

        if(isBlank(str)) {
            return  false;
        }
        ArrayStack stack = new ArrayStack(10);

        int length = str.length();

        /**
         * 把字符串逐个放入栈中
         */
        for (int i = 0; i < length; i++) {
            stack.push(str.charAt(i));
        }


        StringBuilder newStr = new StringBuilder();
        /**
         * 获取出栈的数据
         */

        for (int i = 0; i < length; i++) {

            if(!stack.isEmpty()) {
                char pop = (char)stack.pop();
                newStr.append(pop);
            }
        }

        if(str.equals(newStr.toString())) {
            return true;
        }
        return false;
    }
}
