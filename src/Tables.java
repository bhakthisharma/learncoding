import java.util.Scanner;

public class Tables {
    static int table;
    static  void multiplicationOfGivenNumber(int num){
        for(int i=1;i<=10;i++){
            table=num*i;
            System.out.println(table);
        }
    }
    public static void main(String[] args){
        System.out.println("Enter the number of which you need the table:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("The table of the number you asked is:");
        multiplicationOfGivenNumber(num);
    }
}
