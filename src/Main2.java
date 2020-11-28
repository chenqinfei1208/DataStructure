import java.util.Scanner;
public class Main2 {
    static int n;
    static int[] num;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = scan.nextInt();
        }
        int count = fun(0, 40);
        System.out.println(count);
    }

    static int fun(int i, int sum) {
        if (i == n) {
            return 0;
        }
        if (num[i] == sum) {
            return 1 + fun(i + 1, sum);
        } else if (num[i] < sum) {
            return fun(i + 1, sum - num[i]) + fun(i + 1, sum);
        }
        return fun(i + 1, sum);
    }

}
