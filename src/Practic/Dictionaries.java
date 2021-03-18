package Practic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Dictionaries {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            while(sc.hasNext()){
                int num = sc.nextInt();
                String[] s = new String[num];
                int count = 0;
                for(int i=0;i<num;i++){
                    s[i] = sc.next();
                }
                String key = sc.next();
                char[] keyChar = key.toCharArray();
                Arrays.sort(keyChar);
                int no = sc.nextInt();
                ArrayList<String> list = new ArrayList<String>();
                for(int i=0;i<num;i++){
                    int c = check(key,s[i],keyChar);
                    count += c;
                    if(c==1){
                        list.add(s[i]);
                    }
                    System.out.println(count);
                    Collections.sort(list);
                    if(count == no){
                        System.out.println(list.get(no-1));
                    }
                }

            }
        }
        public static int check(String key,String word,char[] keyChar){
            if(key.equals(word)||key.length() != word.length()){
                return 0;
            }
            char[] wordChar = word.toCharArray();
            Arrays.sort(wordChar);
            return Arrays.equals(keyChar,wordChar)?1:0;
        }
    }

