
import java.util.*;
import java.util.HashMap;
import java.util.Map;

/**
 * 将输入的卖珠子的摊主的一串珠子数全部放入map集合中（key为珠子字符，value为该珠子的数量）。
 * 再遍历小红想要的珠子串，如果map中有他想要的珠子，就把该珠子数量减一；
 * 反之，就用count变量记录下他缺少的珠子数。
 * 在输出时只需要判断count的值是否为0，count为0也就意味着 卖珠子的摊主的这串珠子能够满足
 * 小红的需要，多余的个数为：卖珠子的摊主的这串珠子数 减去 小红需要的珠子数。
 * 如果count不为0，那么就不能满足小红的需要，缺少的个数就是 count的个数。
 */

public class BuyOrNot {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            while (in.hasNext()) {
                String s = in.nextLine();
                String res = in.nextLine();
                Map<Character,Integer> map = new HashMap<>();
                for(int i = 0;i<s.length();i++){
                    int length = map.getOrDefault(s.charAt(i),0);
                    map.put(s.charAt(i),length+1);
                }

                int count = 0;

                for(int j = 0;j< res.length();j++){
                    int len = map.getOrDefault(res.charAt(j),0);
                    if(len <= 0){
                        count ++;
                    }
                    map.put(res.charAt(j),len-1);
                }
                if(count == 0){
                    System.out.println("Yes" +" " + (s.length()-res.length()));
                }else{
                    System.out.println("No"+" " + count);
                }
            }
            in.close();
        }
    }
