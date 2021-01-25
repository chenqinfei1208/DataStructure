import java.util.Scanner;
public class Similar {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            while (sc.hasNext()) {
                int m = sc.nextInt();//行
                int  n = sc.nextInt();//列
                double[] one = new double[m*n];
                double[]two=new double[m*n];
                for (int i = 0; i < m*n; i++) {
                    one[i] = sc.nextInt();
                }
                for (int i = 0; i < m*n; i++) {
                    two[i] = sc.nextInt();
                }
                double count=0;
                for (int i = 0; i <m*n ; i++) {
                    if(one[i]==two[i]){
                        count++;
                    }
                }
                double x=100*(count/(m*n));

                System.out.printf("%.2f",x);
                System.out.println();
            }
        }
    }


