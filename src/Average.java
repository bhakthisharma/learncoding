public class Average {
    static int[] array=new int[]{30,29,56,48,15,67,46,68,20,100};
    static float avg=0;
    static int sum=0,n=array.length;
    static void findingAverageOfElements(){
        for(int i=0;i<n;i++){
            sum=sum+array[i];
        }
        avg=sum/(float)n;
        System.out.println("Average of the elements of Array is:"+avg);
    }
public static void main(String args[]){
        findingAverageOfElements();
}
}
