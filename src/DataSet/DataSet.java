package DataSet;
import java.lang.Math;
/**
 * A set for finding average and standard deviation.
 */
public class DataSet
{
	private int n;
	private double sum;
	private double squaredSum;
	private double stdDev;
	
	/**
	 * Constructs a DataSet and initializes data.
	 */
	public DataSet()
	{
		n=0;
		sum=0;
		squaredSum=0;
		stdDev=0;
	}
	
	/**
	 * Adds passed value to sum and keeps count of entries.
	 * @param value number to add.
	 */
	public void add(double value)
	{
		this.n++;
		this.sum += value;
		this.squaredSum += Math.pow(value,2);
	}
	
	/**
	 * Finds the average value of the data set.
	 * @return the average value of the data set.
	 */
	public double getAverage()
	{
		return (this.sum/this.n);
	}
	
	/**
	 * Finds the standard deviation of the data set.
	 * @return the standard deviation of the data set.
	 */
	public double getStandardDeviation()
	{
		double numer = (this.n * this.squaredSum) - Math.pow(this.sum, 2);
		double denom = this.n*(this.n - 1);
		this.stdDev = Math.sqrt(numer/denom);
		return this.stdDev;
	}
}
