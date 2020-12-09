import java.util.Scanner;
class Obama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String C = sc.next();
        int column = (int) Math.round(n / 2.0);
        for (int i = 0; i <= column; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == column - 1) {
                    System.out.print(C);
                } else {
                    if (j == 0 || j == n - 1) {
                        System.out.print(C);
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
