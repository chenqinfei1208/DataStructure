package Practic;

public class JumpFloor {
    public  int Solution(int target){
            if(target==1)
                return 1;
            if(target==2)
                return 2;
            return Solution(target-1)+Solution(target-2);

        }
    }

