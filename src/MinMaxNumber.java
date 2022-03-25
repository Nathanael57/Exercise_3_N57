import java.util.Random;
public class MinMaxNumber {
    public static void main(String[]args){
        int sizeOfTheCollection=10,i=1;
        int num,min=101,max=0;
        System.out.println("the program draws "+ sizeOfTheCollection+"Integer numbers from 1 to 100");
        System.out.println("And find the smallest and greatest of them");
        Random r=new Random();
        System.out.println("Drawn: ");
        while(i<=sizeOfTheCollection)
        {



            num=Math.round((r.nextInt( 100 )+1));
            System.out.print(num+",");
            if(num<min)min=num;
            if(num>max)max=num;
            i++;
        }
        System.out.println("");
        System.out.println("The largest number in the collection is : "+ max);
        System.out.println("The smallest number in the collection is : "+ min);

    }
}