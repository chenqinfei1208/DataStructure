import java.util.Scanner;
public class CharactorTransform {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            while (sc.hasNext()){
                String str=sc.next();
                if(str.matches("[A-Z]")){
                    System.out.println(str.toLowerCase());
                }else {
                    System.out.println(str.toUpperCase());
                }
            }
        }
    }

