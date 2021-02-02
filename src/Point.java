import java.util.ArrayList;
import java.util.Scanner;

public class Point {

        public static void main(String[] args) {
            ArrayList<Integer> list = new ArrayList<>();
            Scanner sc = new Scanner(System.in);
            //输入需要输入数字个总个数
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                list.add(sc.nextInt());
            }

            //输入删除的数字
            int m = sc.nextInt();
            //循环遍历集合中的数字
            for (int index = 0; index < list.size(); ) {
                if(m == list.get(index)){
                    list.remove(list.get(index));
                    //如果集合里面有和输入的数字相同就减去。集合索引不增加
                }else{
                    //如果集合里面没有相同数字，不进行操作，增加索引值。
                    index++;
                }
            }
            //打印输出删除后集合的长度
            System.out.println(list.size());
            //将集合转换为数组，用于遍历
            Object[] obj = list.toArray();
            for (int i = 0; i < obj.length; i++) {
                if(i != obj.length){
                    System.out.print(obj[i]+" ");
                }else{
                    System.out.print(obj[i]);
                }

            }
        }
    }
