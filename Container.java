
//Don't change the class name
public class Container{
	private Point data;//Don't delete or change this field;
	
	//ADDITIONAL PRIVATE FIELDS
	private Container prevX;
	private Container nextX;
	private Container prevY;
	private Container nextY;
	private Container correspondingX; //Container of first linkedlist has pointer for the container that includes the same point in the second linked list
	private Container correspondingY;
	
	
	public Container(Point point,Container nextX, Container prevX) {
		this.data=point;
		this.nextX=nextX;
		this.prevX=prevX;
		
		// ----------- ??? ---------- HOW TO DO IT ALSO FOR y ?!?!?!?!?!?!!?!??!?
	}
	
	//Constructor of first link
	public Container(Point point) { 
		this(point,null,null);
	}
	//Don't delete or change this function
	public Point getData()
	{
		return data;
	}
	
	//Get Next\Prev X and Y
	public Container getNextX() {
		return nextX;
	}
	public Container getNextY() {
		return nextY;
	}
	public Container getPrevX() {
		return prevX;
	}
	public Container getPrevY() {
		return nextY;
	}
	
	//Set Next\Prev X and Y
	public void setNextX(Container nextX) {
		this.nextX=nextX;
	}
	public void setNextY(Container nextY) {
		this.nextY=nextY;
	}
	public void setPrevX(Container prevX) {
		this.prevX = prevX;
	}
	public void getPrevY(Container prevY) {
		this.prevY = prevY;
	}
}
