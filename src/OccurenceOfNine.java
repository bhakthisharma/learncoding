public class OccurenceOfNine {
    static int[] array=new int[]{12,56,9,6,78,20};
    static int n=3;
    static void findingElementNine(){
        for (int i=0;i<n;i++){
            if(array[i]==9){
                System.out.println("true");
                return;
            }
        }
        System.out.println("false");
    }
    public static void main(String args[]){
        findingElementNine();
    }
}
