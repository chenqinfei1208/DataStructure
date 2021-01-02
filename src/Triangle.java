/**
 * KiKi想知道已经给出的三条边a，b，c能否构成三角形，
 * 如果能构成三角形，判断三角形的类型（等边三角形、等腰三角形或普通三角形）。
 */

import java.util.*;
public class Triangle {

        public static void main(String [] args)
        {
            Scanner sc=new Scanner(System.in);
            while(sc.hasNext()){
                int n1 = sc.nextInt();
                int n2 = sc.nextInt();
                int n3 = sc.nextInt();
                //使用正则表达式判断
                if(n1+n2>n3){
                    if(n1==n2&&n1==n3){
                        System.out.println("Equilateral triangle!");
                    }else if(n1==n2 || n1==n3 || n2==n3)
                        System.out.println("Isosceles triangle!");
                    else
                        System.out.println("Ordinary triangle!");
                }
                else System.out.println("Not a triangle!");
            }
        }}

