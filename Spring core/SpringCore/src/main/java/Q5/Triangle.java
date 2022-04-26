package Q5;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Triangle implements Shape{
	
	private Point pointA;
	private Point PointB;

	
	public Point getPointA() {
		return pointA;
	}
	
	@Required
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	public Point getPointB() {
		return PointB;
	}
	
	public void setPointB(Point pointB) {
		PointB = pointB;
	}
	
	
	public void draw() {
		System.out.println("Drawing Triangle");
		System.out.println("Point A : ("+ getPointA().getX() + "," + getPointA().getY() + ")");
	}

}
