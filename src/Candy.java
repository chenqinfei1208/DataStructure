import java.util.*;
public class Candy {
        public static void maib(String[] args){
            Scanner input = new Scanner(System.in);
            while(input.hasNextInt()){
                int n1 = input.nextInt();
                int n2 = input.nextInt();
                int n3 = input.nextInt();
                int n4 = input.nextInt();
                int A = (n1+n3)/2;
                int B = (n2+n4)/2;
                int C = n4-B;
                if((n1+n3)%2==0 && (n2+n4)%2==0 && (A+B)==n3){
                    System.out.println(A+" "+B+" "+C);
                }else{
                    System.out.println("No");
                }
            }
        }
    }

