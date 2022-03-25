import java.io.BufferedReader;
import  java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Math.pow;
import  static java.lang.Math.sqrt;
public class QuadraticEquationcalc {
    public static void main (String[]args)throws IOException{
        double a,b,c, delta,x1,x2;
        char rootsnumber=0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("This program calculates the roots of the quadratic equation ");
        System.out.println("Enter the value of a ");
        a=Double.parseDouble(br.readLine());
        if(a==0){
            System.out.println("You entered unacceptable value of a");
        }else {
            System.out.println("Enter the value of b");
            b=Double.parseDouble(br.readLine());
            System.out.println("Enter the value of c");

            c=Double.parseDouble(br.readLine());
            delta=pow(b,2)-4*a*c;
            if (delta<0) rootsnumber=0;
            if (delta==0)rootsnumber=1;
            if (delta>0)rootsnumber=2;
            switch (rootsnumber){
                case 0 :
                    System.out.println("There are no real roots");break;
                case 1:
                {
                    x1=-b/(2*a);
                    System.out.printf("For a= "+"%4.2f,",a);
                    System.out.printf(" b= "+"%4.2f,",b);
                    System.out.printf("c= "+"%4.2f,",c);
                    System.out.print("The trinomial has double root =");
                    System.out.printf("%4.2f.\n",x1);
                }break;
                case 2:
                {
                    x1=(-b-sqrt(delta))/(2*a);
                    x2=(-b+sqrt(delta))/(2*a);
                    System.out.printf("For a= "+"%4.2f,",a);
                    System.out.printf(" b= "+"%4.2f,",b);
                    System.out.printf("c= "+"%4.2f. \n",c);
                    System.out.print("x1 = ");
                    System.out.printf("%4.2f.\n",x1);
                    System.out.print("x2 = ");
                    System.out.printf("%4.2f.\n",x2);

                }break;
            }
        }
    }
}