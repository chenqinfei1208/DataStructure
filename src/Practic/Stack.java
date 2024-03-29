package Practic;
/**
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 */

import java.util.Stack;
//每次psuh是时先将stack2清空放入stck1(保证选入的一定在栈底)，stack2始终是用来删除的

//在pop前，先将stack1中中的数据清空放入stack2（保存后入的在栈底），stack1始终用于push


public class Stack {
        Stack<Integer> stack1 = new Stack<Integer>();
        Stack<Integer> stack2 = new Stack<Integer>();

        public void push(int node) {
            while(!stack2.isEmpty()){
                stack1.push(stack2.pop());
            }
            stack1.push(node);
        }

        public int pop() {
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
            return stack2.pop();
        }
    }
