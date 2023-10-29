public class MaxMin {
        static int eles[]=new int[]{1,7,4,5,2,8,9,3,6,10};
        static int max=eles[0],  n=eles.length;
        static int min=eles[0];
        static void findMaxMin()
        {
            for(int i=1;i<n;i++)
            {
                if(eles[i]>max)
                {
                    max=eles[i];
                }
                if(eles[i]<min)
                {
                    min=eles[i];
                }
            }
            System.out.println("The greatest number is:"+max);
            System.out.print("The smallest number is:"+min);
        }
        public static void main(String[] args){
            findMaxMin();
        }
    }

