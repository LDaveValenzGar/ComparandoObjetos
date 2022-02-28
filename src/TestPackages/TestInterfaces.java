package TestPackages;

import org.junit.Test;
import interfaces.Rectangle;
import interfaces.Circle;

public class TestInterfaces {

	@Test
	public void test() {
		Circle circle1 = new Circle(10,10,20);
		Circle circle2 = new Circle(15,15,21);
		
		double areaC1 = circle1.calculateArea();
		double areaC2 = circle2.calculateArea();
		int resultCircles = circle1.compareTo(circle2);
		
		System.out.println(areaC1);
		System.out.println(areaC2);
		System.out.println(resultCircles);
		
		Rectangle rec1 = new Rectangle(10,10,20,20);
		Rectangle rec2 = new Rectangle(30,30,50,50);
				
		double areaR1 = rec1.calculateArea();
		double areaR2 = rec2.calculateArea();
		int resultRecs = rec1.compareTo(rec2);
		
		System.out.println(areaR1);
		System.out.println(areaR2);
		System.out.println(resultRecs);
	}

}
