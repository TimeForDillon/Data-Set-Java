package DataSet;
import java.util.Scanner;

/**
 * Tests the DataSet class.
 */
public class DataSetTester
{
	public static void main(String[] args)
	{
		DataSet set = new DataSet();
		Scanner in = new Scanner(System.in);
		double input;
		System.out.println("Enter some numbers to find their avg and std deviation (-1 to stop): ");
		do
		{
			input = in.nextDouble();
			if(input != -1)
			{
				set.add(input);
			}
		} while(input != -1);
		in.close();
		System.out.printf("The avg is: %f\n",set.getAverage());
		System.out.printf("The std deviation is: %f\n", set.getStandardDeviation());
	}
}

/* Input: 1 2 3 4 5 6 7 8 9 10 -1
 * Output: The avg is: 5.500000
 *		   The std deviation is: 3.027650
 * Expected:The avg is: 5.500000
 *		    The std deviation is: 3.027650
 */
