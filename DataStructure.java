
public class DataStructure implements DT {


	//////////////// DON'T DELETE THIS CONSTRUCTOR ////////////////
	//PRIVATE FIELDS 
	
	private Container minX; //minX is also the first link of the first linkedlist
	private Container minY; //minY is also the first link of the second linkedlist
	private Container maxX; //last link of first linkedlist
	private Container maxY; //last link of second linkedlist
	
	//We implement two bi-directional linked lists
	//the Container plays as the link
	//the first linkedlist contains all points, sorted in increasing order of points' X value
	//the second linkedlist contains all points, sorted in increasing order of points' Y value
	public DataStructure()
	{
		this.minX = null;
		this.minY = null;
		this.maxX=null;
		this.maxY=null;
	}

	
	//SIZE - both linkedlists should be the same size all the time
	public int size()
	{
		int ans=0;
		Container curr = minX; 
		while(curr!=null)
		{
			ans = ans+1;
			curr = curr.getNextX();
		}
		return ans;
	}
	@Override
	public void addPoint(Point point) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Point[] getPointsInRangeRegAxis(int min, int max, Boolean axis) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Point[] getPointsInRangeOppAxis(int min, int max, Boolean axis) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getDensity() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void narrowRange(int min, int max, Boolean axis) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Boolean getLargestAxis() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Container getMedian(Boolean axis) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Point[] nearestPairInStrip(Container container, double width,
			Boolean axis) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Point[] nearestPair() {
		// TODO Auto-generated method stub
		return null;
	}

	
	//TODO: add members, methods, etc.
	
}

