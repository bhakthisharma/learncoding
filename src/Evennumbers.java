import java.util.ArrayList;
public class Evennumbers {
    static ArrayList<Integer> uniquearray=new ArrayList<Integer>();
    static int array[]=new int[]{20,46,47,37,19,47,36,69,20,36,67,48};
    static int n;
    static int num=0;
    static void findUniqueNumbers(){
        System.out.println("Unique array:");
        for(int i=0;i<n;i++){
            if(!uniquearray.contains(array[i])){

               uniquearray.add(array[i]);
            }
        }
        System.out.println(uniquearray);
    }
    static void numberofEvenNumbers(){
        System.out.println("The numbers are:");
        for(int i=0;i<uniquearray.size();i++){
         if(uniquearray.get(i)%2==0){
             num++;
             System.out.println(uniquearray.get(i));
         }
        }
        System.out.println("The number of even numbers are:");
        System.out.println(num);
    }
    public static void main(String args[]){
        findUniqueNumbers();
        numberofEvenNumbers();
    }
}
