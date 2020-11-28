import java.util.Stack;

public class StackQueue {
        Stack<Integer> stack1 = new Stack<Integer>();
        Stack<Integer> stack2 = new Stack<Integer>();

        public void push(int node) {
            while(!stack2.isEmpty()){
                stack1.push(stack2.pop());
            }
            stack1.push(node);

        }

        public int pop() {
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
            return stack2.pop();
        }
        public static void main(String[] args){
            StackQueue stackQueue = new StackQueue();
            stackQueue.push(1);
            stackQueue.push(2);
            System.out.println(stackQueue.pop());
            stackQueue.push(3);
            System.out.println(stackQueue.pop());
            stackQueue.push(4);
            System.out.println(stackQueue.pop());
            stackQueue.push(5);
            System.out.println(stackQueue.pop());
            System.out.println(stackQueue.pop());
        }
    }

