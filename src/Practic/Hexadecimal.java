package Practic;
import java.util.Scanner;
public class Hexadecimal {
        public static void main(String[] args) {
            // TODO Auto-generated method stub
            Scanner in=new Scanner(System.in);
            while(in.hasNext()){
                String firstnum=in.next().substring(2);//
                //System.out.println(firstnum);
                //valueOf数值类型转换
                //先
                String finalnum=Integer.valueOf(firstnum,16).toString() ;
                System.out.println(finalnum);
            }
        }


    }

