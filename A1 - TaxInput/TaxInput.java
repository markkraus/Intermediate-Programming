
import java.util.Scanner; // import the Scanner class to gain access to make our Scanner object

public class TaxInput {
  public static void main(String[] args) {
    System.out.print("Enter your name income and 401k contribution on the same line separated by an empty space i.e. mike 12000 2500: ");

    Scanner keyboard = new Scanner(System.in); // keyboard is now how we will prompt for input
    String userName;
    double income,taxable,retire,ftax,stax,ltax,ptax,takehome; // these are the variables you will need to set or calculate
    // name, income, 401k
    userName = keyboard.next();
    income = keyboard.nextDouble();
    retire = keyboard.nextDouble();
    //calc taxable (income -retire)
    taxable = income - retire;
    //calc 10% fedtax, 3.07% statetax, 1%localtax, 6.2% payroll tax
    ftax = taxable * .10;
    stax = taxable * .0307;
    ltax = taxable * .01;
    ptax = taxable * .062;
    //calc takehome (taxable - all the taxes)
    takehome = taxable - (ftax + stax + ltax + ptax);


    System.out.println("Taxpayer name is: " + userName);
    System.out.println("Their income was: " + income);
    System.out.println("Their taxable income was: " + taxable);
    System.out.println("Their fedtax amount due is: " + ftax);
    System.out.println("Their state tax amount due is: " + stax);
    System.out.println("Their local tax amount due is: " + ltax);
    System.out.println("Their payroll tax amount due is: " + ptax);
    System.out.println("Their takehome amount is: " + takehome);
    }
}