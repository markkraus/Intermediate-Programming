import java.util.*;
import java.io.*;

public class FiletoArray
{
	static final int MAX_CAPACITY = 25;

	public static void main( String args[] ) throws Exception
	{
		if (args.length < 1 )
		{
			System.out.println("usage: $ java FiletoArray Requires a filename to read from!");
			System.exit(0);
		}

		int[] arr = new int[ MAX_CAPACITY ];
		int count=0;

		Scanner infile = new Scanner( new File( args[0] ) );
		while ( infile.hasNextInt() )
		{

			arr[count] = infile.nextInt();
			++count;
		}

		arr = trimArray( arr, count );
		printArray( arr, count );

	} // END MAIN

	// ############################################################################################################

	static int[] trimArray( int[] array, int count  )
    {
        int[] trimmed = new int[count];
           for ( int i=0 ; i< count ; ++i )
			   trimmed[i] = array[i];
       return trimmed;
    }

	static void printArray( int[] array, int count  )
    {
        for ( int number : array )
            System.out.print( number + " ");
        System.out.println();
    }

} // END CLASS
