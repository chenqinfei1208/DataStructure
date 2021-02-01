import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;


public class ArrayChange {

        public static void main(String[] args) throws ParseException, IOException {


            Scanner scanner = new Scanner(System.in);

            String str = scanner.nextLine().trim();
            String[] strs = str.split(" ");
            for(int i=strs.length-1;i>=0;--i)
            {

                System.out.print(strs[i]);
                if(i!=0)
                    System.out.print(" ");

            }

        }
    }

