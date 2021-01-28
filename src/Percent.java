import java.util.Scanner;
public class Percent {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            while(sc.hasNext()){
                int n = sc.nextInt();
                float m = denominator(n);//所有可能抽到的情况
                float z = misSort(n);//抽错的情况
                float result = (z / m)*100;//无人中奖的情况
                System.out.println(String.format("%.2f",result)+"%");//打印出概率
            }
        }


        public static float denominator(int n) {
            float result = 1;
            if(n == 0){
                return 1;
            }else if(n>0){
                result = n*denominator(n-1);
            }
            return result;
        }

        public static float misSort(int n) {
            if(n == 1){
                return 0;
            }else if(n == 2){
                return 1;
            }else{
                return (n-1)*(misSort(n-1)+misSort(n-2));
            }
        }
    }

