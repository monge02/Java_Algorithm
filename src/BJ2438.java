import java.util.Scanner;

public class BJ2438 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i, j;

        for (i=0; i<a; i++) {
            for (j=0; j<=i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}