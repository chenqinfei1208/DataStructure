package Practic;

import java.util.Arrays;

public class MoreThanHalfNum {
    public int MoreThanHalfNum_Solution(int[] array) {
        Arrays.sort(array);
        int count = 0;
        int length = array.length;
        for (int i = 0; i < length; i++) {
            if (array[i] == array[length / 2]) {
                count++;
            }
        }
        if (count > length / 2) {
            return array[length / 2];
        } else {
            return 0;
        }


    }
}
