import java.util.Scanner;

public class BJ2739 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j;
        int a = sc.nextInt();

        for(i=a; i<a+1; i++) {
            for(j=1; j<10; j++) {
                System.out.println(i + " * " + j + " = " + i*j);
            }
        }
    }
}