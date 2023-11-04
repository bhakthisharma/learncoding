import java.util.Scanner;
public class SumofOddEvenNumbers {
    static int sumEven=0,sumOdd=0;
    static void findingSumofOddAndEvenNumbers(){
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.println("Enter a number:");
            int n=sc.nextInt();
            if(n==0)
            {
                break;
            }
            if(n%2==0)
            {
                sumEven=sumEven+n;
            }
            else
            {
                sumOdd=sumOdd+n;
            }
        }
        System.out.println("Sum of the Even numbers you ehtered is:"+sumEven);
        System.out.println("Sum of the Odd numbers you ehtered is:"+sumOdd);
    }
   public static void main(String args[]){
       findingSumofOddAndEvenNumbers();
   }
}
