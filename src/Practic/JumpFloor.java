package Practic;
/**
这一题就是延续上一题的斐波那契数列的思路，青蛙跳1级台阶有1种跳法，2级台阶有2种跳法
3级台阶时可以从1级台阶跳上来也可以从2级台阶跳上来，即等于1级台阶的跳法加2级台阶的跳法
因此n级台阶共有n-2级台阶跳法数+n-1级台阶跳法数；这不就变成了上一道题目么,只是初始数字变了
n=1，sum=1,n=2,sum=2,n=3,sum=3;
*/

public class JumpFloor {
    public  int Solution(int target){
            if(target==1)
                return 1;
            if(target==2)
                return 2;
            return Solution(target-1)+Solution(target-2);

        }
    }
//class Solution {
//public:
//    int jumpFloor(int number) {
//        int t1=1,t2=2,total=0;
//        if (number==1||number==2) return number;
//        for(int i=3;i<=number;i++) {
//            total=t1+t2;
//            t1=t2;
//            t2=total;
//        }
//        return total;
//    }
//};
