package Practic;
import java.util.*;

public class Count2 {
        public int countNumberOf2s(int n) {
            // write code here
            int count=0;
            for(int i=0;i<=n;i++){
                String s=Integer.toString(i);//Integer.toString()，返回一个 String指定整数的 String对象
                for(char ch: s.toCharArray()){//
                    if(ch=='2'){
                        count++;
                    }
                }
            }
            return count;
        }
        public static void main(String[] args) {
            Count2 m=new Count2();
            Scanner input=new Scanner(System.in);
            int n=input.nextInt();
            System.out.println(m.countNumberOf2s(n));
        }
    }

