package com.simple.stack;

/**
 * @Author Simple
 * @Create 2023/3/13 15:31
 */
public class Calculate {

    public static void main(String[] args) {
        String str = "2-3";

        /**
         * 1.需要遍历字符串,获取每个字符
         * 2.判断当前字符是运算符还是数字
         * 3.把数字存放在数字栈中,把运算符存放在运算符栈
         * 4.运算符栈：如果是一个空栈，那么直接入栈；如果是栈内有运算符，就需要比较运算符的优先级。新进入的栈的运算符如果小于栈中的运算符
         * 那么需要把原栈内的运算符弹出，数字栈中数字进行弹栈 然后进行运算。 运算之后的结果重新放入数字栈中，新的运算符入栈；
         * 新进入的栈的运算符如果小于栈中的运算符，直接入栈；
         */

        ArrayStack numStack = new ArrayStack(10);
        ArrayStack symbolStack = new ArrayStack(10);


        int tempNum1 = 0;
        int tempNum2 = 0;
        int result = 0;
        int symbolChar = 0;
        /** 两位数及其以上的情况**/
        String values ="";
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char c = str.charAt(i);

            if(symbolStack.isOper(c)) {
                if(!symbolStack.isEmpty()) {
                    if(symbolStack.priority(c) <= symbolStack.priority(symbolStack.peek())) {
                        /**
                         * 1.去符号栈中获取栈顶的符合
                         * 2.去数字栈中获取两个数字
                         */

                        tempNum1 = numStack.pop();
                        tempNum2 = numStack.pop();
                        symbolChar = symbolStack.pop();

                        result = numStack.calculate(tempNum1, tempNum2, symbolChar);
                        /**
                         * 计算结果入栈
                         */
                        numStack.push(result);
                        /**
                         * 当前符号入栈
                         */
                        symbolStack.push(c);
                    } else  {
                        symbolStack.push(c);
                    }
                }else {
                    symbolStack.push(c);
                }
            }else {
                values += c;

                if( i == length -1) {
                    numStack.push(Integer.parseInt(values));
                }else {
                    char data = str.substring(i+1, i+2).charAt(0);

                    if(symbolStack.isOper(data)) {
                        numStack.push(Integer.parseInt(values));
                        values ="";
                    }
                }
            }
        }

        while(true) {
            if(symbolStack.isEmpty()) {
                break;
            }

            tempNum1 = numStack.pop();
            tempNum2 = numStack.pop();
            symbolChar = symbolStack.pop();
            result = numStack.calculate(tempNum1,tempNum2,symbolChar);
            numStack.push(result);
        }

        System.out.println("total = "+numStack.pop());
    }
}
