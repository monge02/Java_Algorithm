import java.util.Scanner;

public class BJ2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int index = 0;
        int[] arr = new int[9];


        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

            if(arr[i] > max) {
                max = arr[i];
                index = i+1;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}