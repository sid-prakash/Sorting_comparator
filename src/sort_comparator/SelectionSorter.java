/**
 * @author Siddharthan Prakash
 * 
 * 
 * This class implements selection sort.   
 *
 */

public class SelectionSorter extends AbstractSorter
{
	
	/**
	 * Constructor takes an array of points.  It invokes the superclass constructor, and also 
	 * set the instance variables algorithm in the superclass.
	 *  
	 * @param pts  
	 */
	public SelectionSorter(Point[] pts)  
	{
		super(pts);
		algorithm = "selection sort"; 
	}	

	
	/** 
	 * Apply selection sort on the array points[] of the parent class AbstractSorter.  
	 * 
	 */
	@Override 
	public void sort()
	{
		for (int i = 0; i < points.length; i++) {
			int indexSmallest = i;
			
			for (int j = i+1; j < points.length; j++) {
				if(pointComparator.compare(points[j], points[indexSmallest]) == -1) {
					indexSmallest = j;
				}
			}
			
			swap(i, indexSmallest);
		}
	}
	
	
}
