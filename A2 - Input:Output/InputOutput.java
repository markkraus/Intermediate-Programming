import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors
public class InputOutput {
    public static void main(String args[]) throws FileNotFoundException,IOException {
      double taxable,ltax,stax,ptax,ftax,takehome;
	    int income,retire;
      String name;
      boolean city;
	  // make scanner to read input file - CHANGE INPUT TO YOUR FILE'S CURRENT DIRECTORY
    Scanner infile = new Scanner(new File("/Users/Mark/Desktop/Input-Output/a2input.txt"));
	  //make filewriter for output file
    FileWriter myWriter = new FileWriter("/Users/Mark/Desktop/Input-Output/a2output.txt");
	  //////////Begin loop
    while(infile.hasNext())
    {
	  //use scanner to set values for income,retire,name,city
    name = infile.next();
    income = infile.nextInt();
    retire = infile.nextInt();
    city = infile.nextBoolean();
	  // calc taxable as income - retire
    taxable = income - retire;
	  // city residents pay 2% of their txable income to local taxable otherwise its 1% for non city
    if(city = true)
    {
      ltax = taxable * .02;
    }
    else
    {
      ltax = taxable * .01;
    }
	  // payroll tax is a flat 6.2% of taxable
    ptax = taxable * .062;
	  // state tax is a flat 3.07% of taxable
    stax = taxable * .0307;
	  /* Federal tax brackets
	  taxable is:
	  0-8500 0%
	  less than or eqaul to 12000 10%
	  less than or eqaul to 20000 15%
	  less than or equal to 50000 20%
	  over that amount is 25%
	  **
	  */

    if(taxable <= 8500)
    {
      ftax = 0;
    }
    else if(taxable <= 12000 && taxable > 8500)
    {
      ftax = taxable * .10;
    }
    else if (taxable <= 20000 && taxable > 12000)
    {
      ftax = taxable * .15;
    }
    else if (taxable <= 50000 && taxable > 20000)
    {
      ftax = taxable * .20;
    }
    else
    {
      ftax = taxable * .25;
    }

    takehome = taxable - (ltax + ptax + stax + ftax);

    myWriter.write("Taxpayer name is: " + name + "\n");
    myWriter.write("Ftax is: " + ftax + "\n");
    myWriter.write("Stax is: " + stax + "\n");
    myWriter.write("Ltax is: " + ltax + "\n");
    myWriter.write("Ptax is: " + ptax + "\n");
    myWriter.write("Takehome is: " + takehome + "\n");


      //////////end loop
    }
	  // close your output file
    myWriter.close();
    }//main
}//class
