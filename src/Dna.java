import java.util.*;
public class Dna {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int num = sc.nextInt();
        double maxradio = 0.0;//记录目前出现的最高比例
        String maxStr = "";//记录比例最高的字符串
        for(int i=0;i<=str.length()-num;i++){
            String strs = str.substring(i,i+num);
            double curRatio = function(strs);
            if(curRatio>maxradio){
                maxStr = strs;
                maxradio = curRatio;
            }
        }
        System.out.println(maxStr);

    }
//返回一个字符串的GC比例
    public static double function(String strs) {
        int count = 0;
        for(int i=0;i<strs.length();i++){
            if(strs.charAt(i) == 'C'){
                count++;
            }
        }
        return count/(double)strs.length();
    }

}
