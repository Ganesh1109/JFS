package Q5;

import javax.annotation.Resource;


public class Circle implements Shape{
	
private Point center;
	
	public void draw() {

		System.out.println("Circle is printing");
		System.out.println("center : (" + center.getX() + "," + center.getY() + ")");
	}
	
	public Point getCenter() {
		return center;
	}
	
	@Resource(name = "pointC")
	public void setCenter(Point center) {
		this.center = center;
	}

}
