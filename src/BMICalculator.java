import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
    public class BMICalculator {
        public static void main(String[]args) throws IOException {
            float NathanaelHeight, NathanaelWeight, NathanaelBodyMassIndex;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("this program will calculate the Body mass index");
            System.out.println("Please enter your height in cm (then press enter)");
            NathanaelHeight = Float.parseFloat(br.readLine()) / 100;
            System.out.println("Please enter your weight in kg (then press enter)");
            NathanaelWeight = Float.parseFloat(br.readLine());
            NathanaelBodyMassIndex = (float) (NathanaelWeight / (Math.pow(NathanaelHeight, 2)));
            System.out.printf("Dear your BMI is:" + "%2.2f,\n", NathanaelBodyMassIndex);
            if (NathanaelBodyMassIndex < 16) {
                System.out.println("you are starving");
            } else if (NathanaelBodyMassIndex >= 16 && NathanaelBodyMassIndex < 16.99) {
                System.out.println("you are emaciated)");
            } else if (NathanaelBodyMassIndex >= 17 && NathanaelBodyMassIndex < 18.49) {
                System.out.println("You are underweight)");
            } else if (NathanaelBodyMassIndex >= 18.50 && NathanaelBodyMassIndex < 22.99) {
                System.out.println("You are in the low range of the norm");
            } else if (NathanaelBodyMassIndex >= 23 && NathanaelBodyMassIndex < 24.99) {
                System.out.println("You are in the high range of the norm");
            } else if (NathanaelBodyMassIndex >= 25 && NathanaelBodyMassIndex < 27.49) {
                System.out.println("You are overweight(pre-obese)");
            } else if (NathanaelBodyMassIndex >= 27.50 && NathanaelBodyMassIndex < 29.99) {
                System.out.println("You are overweight)");
            } else if (NathanaelBodyMassIndex >= 30 && NathanaelBodyMassIndex < 34.99) {
                System.out.println("You have 1st degree obesity");
            } else if (NathanaelBodyMassIndex >= 35 && NathanaelBodyMassIndex < 39.99) {
                System.out.println("You have 2nd degree obesity");
            } else if (NathanaelBodyMassIndex > 40) {
                System.out.println("You 3rd degree obesity");

            }
        }
    }
