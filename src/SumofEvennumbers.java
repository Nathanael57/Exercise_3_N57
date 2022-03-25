public class SumofEvennumbers {
    public static void main(String[] args)
    {

        int SumNum100=0;
        int i;
        for(i=0;i<=100;i+=2)
        {
            if(i%2==0)
            {
                SumNum100=SumNum100+i;
            }

        }
        System.out.println("The sum of even numbers from 1 up to 100 is:"+SumNum100);
    }
}