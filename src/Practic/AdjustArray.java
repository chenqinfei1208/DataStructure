package Practic;

/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，并保证奇数和奇数，
 * 偶数和偶数之间的相对位置不变。
 */

/**
 * 从题目得出的信息：
 * 相对位置不变--->保持稳定性；奇数位于前面，偶数位于后面 --->存在判断，挪动元素位置；
 * 这些都和内部排序算法相似，考虑到具有稳定性的排序算法不多，例如插入排序，归并排序等；这里采用插入排序的思想实现
 */

public class AdjustArray {
        public void reOrderArray(int [] array) {
            //相对位置不变，稳定性
            //插入排序的思想
            int m = array.length;
            int k = 0;//记录已经摆好位置的奇数的个数
            for (int i = 0; i < m; i++) {
                if (array[i] % 2 == 1) {
                    int j = i;
                    while (j > k) {//j >= k+1
                        int tmp = array[j];
                        array[j] = array[j-1];
                        array[j-1] = tmp;
                        j--;
                    }
                    k++;
                }
            }
        }
    }

