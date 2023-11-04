import java.util.Scanner;
public class Adder {
    static int n=0,sum=0;
    static void stopInput() {
        Scanner sc=new Scanner(System.in);
        while(true) {
            System.out.println("Enter the number:");
            int n=sc.nextInt();
            if(n==0) {
                break;
            }
            else
            {
                sum = sum+n;
            }
        }
        System.out.println("Sum of the numbers you entered is:" + sum);
    }
    public static void main(String args[]){
        stopInput();
    }
}
