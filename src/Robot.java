import java.util.*;
public class Robot {
        public int countWays(int[][] map,int x, int y) {
            // write code here
            int[][] array = new int[x][y];
            for(int i=0;i < x;i++){
                for(int j = 0;j<y;j++){
                    if(map[i][j]==0){continue;}
                    else if(i==0 && j==0) {array[0][0]=1;}
                    else if(i==0 && j!=0) {array[0][j]=array[0][j-1];}
                    else if(i!=0 && j==0) {array[i][0]= array[i-1][0];}
                else {
                        array[i][j] = (array[i-1][j]+array[i][j-1])%1000000007;
                    }
                }
            }
            return array[x-1][y-1];
        }
    }

