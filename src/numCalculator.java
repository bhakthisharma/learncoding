import java.util.Scanner;
public class numCalculator {

    static int large = Integer.MIN_VALUE, small = Integer.MAX_VALUE, n;

    static void stopInput() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the number:");
            int n = sc.nextInt();
            if (n==0) {
                break;
            }
            if (n<small) {
                small = n;

            }
            if (n>large) {
                large = n;
            }

        }
        System.out.println("The largest number you entered is:" + large);
        System.out.println("The largest number you entered is:" + small);
    }
        public static void main(String args[]){
            stopInput();
        }
}
