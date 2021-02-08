package Practic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.*;
import java.util.*;

public class SecondNumber {
    //自测是可以的，但是这环境跑不出来，可能超时了。。。
        public static void main(String [] args)throws IOException {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            String str=null;
            while((str=br.readLine())!=null){
                int n=Integer.parseInt(str);
                if(n>=1&&n<=99999){
                    long result=0;
                    for(int i=1;i<=2000000;i++){
                        result =(long)i*n;
                        if(bnum(result)){
                            System.out.println(n+": "+result);
                            break;
                        }
                    }
                }else{
                    break;
                }
            }
        }
        public static boolean bnum(long num){
            String s=""+num;
            char [] c=s.toCharArray();
            int isNum=0;
            for(int i=1;i<c.length;i++){
                if(c[i]!=c[i-1]){
                    isNum++;
                }
            }
            if(isNum==1){
                return true;
            }else{
                return false;
            }
        }
    }
