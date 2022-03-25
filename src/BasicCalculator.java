import java.io.BufferedReader;
import  java.io.IOException;
import java.io.InputStreamReader;
public class BasicCalculator {
    public static void main(String[] args) throws IOException {
        float firstNumberNathanael, secondnumberNathanael, sum, substraction, product, quotient;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("The program calculates sum, difference, product and quotient for two numbers");
        System.out.println("Please enter the first number (then press enter):");
        firstNumberNathanael=Float.parseFloat(br.readLine());
        System.out.println("Please enter the second number (and press enter):");
        secondnumberNathanael=Float.parseFloat(br.readLine());
        sum=firstNumberNathanael+secondnumberNathanael;
        substraction=firstNumberNathanael-secondnumberNathanael;
        product=firstNumberNathanael*secondnumberNathanael;
        quotient=firstNumberNathanael/secondnumberNathanael;
        System.out.printf("you entered two numbers, the first one is :"+"%2.2f",secondnumberNathanael);
        System.out.printf("and the second is:"+"%2.2f",secondnumberNathanael);
        System.out.println();
        System.out.printf("sum = "+"%2.2f, \n",+sum);
        System.out.printf("difference = "+"%2.2f, \n",+substraction);
        System.out.printf("product = "+"%2.2f, \n",+product);
        System.out.printf("qoutient = "+"%2.2f, \n",+quotient);
    }
}