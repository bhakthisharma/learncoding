import java.util.Scanner;

public class guessTheNumber {
    static int number=2129;
    static void guessTheNumber(){
        while(true){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a number:");
            int userinput=sc.nextInt();
            if(userinput==number){
                System.out.println("Congratulations..!You guessed it.");
                break;
            }
            else if(userinput>=number)
            {
                System.out.println("The number is big");
            }
            else if(userinput<=number){
                System.out.println("The number is small");
            }

        }
    }
    public static void main(String args[]){
       guessTheNumber();
    }
}
