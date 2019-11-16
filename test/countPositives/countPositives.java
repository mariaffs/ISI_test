package countPositives;

public class countPositives {
	/**
	* Counts positive elements in array
	*
	* @param x array to search
	* @return number of positive elements in x
	* @throws NullPointerException if x is null
	*/
	public static int countPositive (int[] x)
	{
	int count = 0;
	for (int i=0; i < x.length; i++)
	{
	if (x[i] >= 0) // if I don't want to count 0, I have to put just '>' 0, this way my program just count numbers > 0, not 0java4
	{
	count++;
	}
	}
	return count;
	}
}
