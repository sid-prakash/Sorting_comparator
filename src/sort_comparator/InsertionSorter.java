/**
 * @author Siddharthan Prakash
 * 
 * 
 * This class implements insertion sort.   
 *
 */

public class InsertionSorter extends AbstractSorter 
{
	
	/**
	 * Constructor takes an array of points.  It invokes the superclass constructor, and also 
	 * set the instance variables algorithm in the superclass.
	 * 
	 * @param pts  
	 */
	public InsertionSorter(Point[] pts) 
	{
		super(pts);
		algorithm = "insersion sort";
	}	

	
	/** 
	 * Perform insertion sort on the array points[] of the parent class AbstractSorter.  
	 */
	@Override 
	public void sort()
	{
		int n = points.length;
		for (int i = 1; i < n; i++) {
			Point p = points[i];
			int j = i - 1;
			while (j > -1 && (pointComparator.compare(points[j],p) == 1)) {
				points[j+1] = points[j];
				j--;
			}
			points[j+1] = p;
		}
	}		
}
