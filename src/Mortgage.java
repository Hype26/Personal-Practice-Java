import java.text.NumberFormat;
import java.util.Scanner;

//Mortgage Calculation = P{r(1+r)^n/(1+r)^n -1}
// P = principal, r = monthly rate, n = number of monthly payments

public class Mortgage {
    public static void main(String[]  args){

        Scanner scanner = new Scanner(System.in);

        final int percent = 100;
        final int monthsInAYear = 12;

        System.out.print("Principal: ");
        double principal = scanner.nextDouble();

        System.out.print("Annual Interest Rate: ");
        float monthlyInterestRate =  (scanner.nextFloat()) / percent / monthsInAYear;

        System.out.print("Period (Years): ");
        float monthlyPayments = (scanner.nextFloat() * monthsInAYear);

        double topCalculation = monthlyInterestRate * (Math.pow(1 + monthlyInterestRate, monthlyPayments));;

        double bottomCalculation = ( Math.pow(1 + monthlyInterestRate, monthlyPayments ) - 1 );

        double mortgage = principal * (topCalculation/ bottomCalculation);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);

        System.out.println("Mortgage: " + mortgageFormatted);

    }
}
