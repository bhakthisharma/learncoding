public class Reversearray {
    static int array[]=new int[]{1,2,3,4,5,6,7,8,9,10};
    static int n=array.length;

    static void reverseArray(){
        System.out.println("Reversed array elements are:");
        for(int i=array.length-1; i>=0;i--){
            System.out.println(array[i]);
        }

    }
    public static void main(String[] args) {

        reverseArray();
    }
}
