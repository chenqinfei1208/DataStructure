import java.util.*;
public class PrintArr {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            while (sc.hasNext()) {
                int n = sc.nextInt();
                int[] arr = new int[n];
                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                }
                int retExclusive = 0;
                for (int i = 0; i <n ; i++) {
                    retExclusive^=arr[i];
                }
                int index = findIndex(retExclusive);
                int num1 = 0;
                int num2 = 0;
                for (int i = 0; i <n ; i++) {
                    if (judgeIndex(arr[i],index)){
                        num1^=arr[i];
                    }else{
                        num2^=arr[i];
                    }
                }
                if (num1<num2){
                    System.out.println(num1+" "+num2);
                }else{
                    System.out.println(num2+ " " + num1);
                }
            }
        }
        public static int findIndex(int num){
            //在整数num中找到最右边是1的位置
            int index = 0;
            while ((num&1)==0){
                num>>=1;
                index++;
            }
            return index;
        }
        public static boolean judgeIndex(int num,int index){
            //判断整数num右边第num位是否为1
            num>>=index;
            return ((num&1)==1);
        }
    }
/**
 * 链接：https://www.nowcoder.com/questionTerminal/200d8d789f9f431999fac795bb094356
 * 来源：牛客网
 * 2
 *
 * import java.util.Arrays;
 * import java.util.HashMap;
 * import java.util.Map;
 * import java.util.Scanner;
 *
 * public class Main {
 *     public static void main(String[] args) {
 *         Scanner in = new Scanner(System.in);
 *
 *         while (in.hasNext()){
 *             int n = in.nextInt();
 *             int[]num = new int[n];
 *             int[]num1 = new int[2];
 *             Map<Integer,Integer> map = new HashMap<>();
 *             for (int i = 0; i < n ; i++) {
 *                 num[i] = in.nextInt();
 *             }
 *             for (int j = 0; j < n ; j++) {
 *                 if(map.containsKey(num[j])){
 *                     map.put(num[j],map.get(num[j])+1);
 *                 }else {
 *                     map.put(num[j],1);
 *                 }
 *             }
 *             int k =0;
 *             for (Integer key:map.keySet()) {
 *                 if(map.get(key)%2!=0){
 *                     num1[k] = key;
 *                     k++;
 *                 }
 *
 *             }
 *             Arrays.sort(num1);
 *             String a ="";
 *             a =num1[0]+" "+num1[1];
 *             System.out.println(a);
 *
 *         }
 *     }
 * }
 *
 */

/**
 * 3
 * import java.util.ArrayList;
 * import java.util.Collections;
 * import java.util.Scanner;
 *
 * public class Question1 {
 *     public static void main(String[] args) {
 *         Scanner scanner = new Scanner(System.in);
 *         ArrayList<Integer> arrayList = new ArrayList<>();
 *         ArrayList<Integer> result = new ArrayList<>();
 *         int n = scanner.nextInt();
 *         for(int i = 0;i < n;i++) {
 *             arrayList.add(scanner.nextInt());
 *         }
 *         Collections.sort(arrayList);
 *         int a = arrayList.get(0);
 *         int flag = 0;
 *         int j = 0;
 *         while(j < n) {
 *             while (j < n && a == arrayList.get(j)) {
 *                 flag++;
 *                 j++;
 *             }
 *             if(flag % 2 == 1) {
 *                 result.add(arrayList.get(j - 1));
 *             }
 *             if(j < n) {
 *                 a = arrayList.get(j);
 *             }
 *             flag = 0;
 *         }
 *         System.out.println(result.get(0) + " " + result.get(1));
 *     }
 * }
 */

