import java.util.*;
import java.io.*;

public class A3
{
	static final int MAX_CAPACITY = 30;

	public static void main( String args[] ) throws Exception
	{

		if(args.length < 1)
		{
			System.out.println("Supply a name for the program to use for input");
			System.exit(0);
		}
		//Declare an int array and use the constant MAX_CAPACITY to set its size. Also, declare a count variable and set to 0
		int[] arr = new int[MAX_CAPACITY];
		int count = 0;
		//scanner object to read from the input file
		Scanner infile = new Scanner(new File(args[0]));

		//The file reading loop
		while(infile.hasNextInt())
		{
		// Pull an int value from the file( using .nextInt()
		int newVal = infile.nextInt();
		//Call insertInOrder method
		insertInOrder(arr, count, newVal);
		++count;
		//End Item 4 Loop
	  }


		//Item 5: Call the trimArray method to get rid of the excess empty values
		arr = trimArray(arr, count);
		//Item 6: call printArray method
		printArray(arr, count);
	} // END MAIN

	// ############################################################################################################

	static int[] trimArray( int[] arr, int count)
    {

				int[]smaller = new int[count];

    for (int i = 0; i < count; i++)
		// inside the loop
      smaller[i] = arr[i];
       return smaller;
    }

	static void printArray( int[] arr, int count)
    {
        // print each value in the array, insert an empty space between each value
				for (int number : arr) // enhance for loop, : operator is the "set operator"
            System.out.print( number + " ");
        System.out.println();
    }

	static void insertInOrder( int[] arr, int count, int newVal)
	{
		// create a counter variable for the for loop
		int i;
		for(i = count-1; i >= 0 && newVal < arr[i]; i--)
		{
			arr[i + 1] = arr[i];
		}
		arr[i + 1] = newVal;
		// approach insertinorder from the right hand(high side) of the array
		

		if(i >= 0 && newVal < arr[i])
		{
			arr[i + 1] = newVal;
		}


	}

} // END A3
