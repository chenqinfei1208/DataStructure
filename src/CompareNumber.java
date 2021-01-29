import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class CompareNumber {

        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String line = null;
            String[] str;
            while ((line = br.readLine())!= null) {
                int n = Integer.parseInt(line);
                str = new String[n];
                for (int i = 0; i < n; i++) {
                    str[i] = br.readLine();
                }
                paixu(n, str);

            }

        }
        public static void paixu(int n,String str[]){
            String temp;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (compare(str[i], str[j])) {
                        temp = str[i];
                        str[i] = str[j];
                        str[j] = temp;
                    }

                }
            }
            for (int m = 0; m < n; m++) {
                System.out.println(str[m]);
            }

        }
        public static boolean compare(String s1,String s2) {
            int len1 = s1.length();
            int len2 = s2.length();
            if (len1 > len2) {
                return true;
            }else if (len1 < len2) {
                return false;
            }else {
                if (s1.compareTo(s2) > 0) {
                    return true;
                }
            }
            return false;
        }

    }

