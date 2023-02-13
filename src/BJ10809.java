import java.util.Scanner;

public class BJ10809 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[26];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }

        String s = sc.next();

        for(int i = 0; i<s.length(); i++) {
            int index = s.charAt(i) - 'a';

            if(arr[index] == -1) {
                arr[index] = i;
            }
        }

        for(int val : arr) {
            System.out.print(val + " ");
        }
   }
}