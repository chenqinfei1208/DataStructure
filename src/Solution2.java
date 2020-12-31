/**
 * KiKi最近学习了信号与系统课程，这门课里有一个非常有趣的函数，
 * 单位阶跃函数，其中一种定义方式为：
 * 现在试求单位冲激函数在时域t上的值。
 */

import java.util.Scanner;
public class Solution2 {
        public static void main(String [] args)
        {
            Scanner sc=new Scanner(System.in);
            while(sc.hasNextInt())
            {
                int t=sc.nextInt();
                if(t>0)
                {
                    System.out.println("1");
                }
                else if(t==0)
                {
                    System.out.println("0.5");
                }
                else
                {
                    System.out.println("0");
                }
            }
        }
    }

