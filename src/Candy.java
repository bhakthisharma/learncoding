public class Candy{
    static int candies[]=new int[]{2,5,10,13,8,3,19,1,7,12};
    static int n=candies.length;
    static int numberOfKids=0;

    static void findCandiesAbove18(){
        for(int i=0;i<n;i++) {
            if(candies[i]+10>=18){
                numberOfKids++;
                System.out.println(candies[i]);
            }
        }
        System.out.println("Number of Kids having more than 18 candies are:"+numberOfKids);
    }
    public static void main(String args[]){
        findCandiesAbove18();
    }

}
