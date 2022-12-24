package projectClass;
class Circle{
	double  radius;
	final static double pi =3.14;
	void area() {
		double area = pi*radius*radius;
		System.out.println("the area of the circle is " + area);	
	}
	void diameter() {
		double diameter = 2*radius;
		System.out.println("diameter of the circle is"+ diameter);	
	}
	void circumference() {
		double circumference = 2*pi*radius;
		System.out.println("circumference "+circumference);		
	}	
}
public class CircleArea {

	public static void main(String[] args) {
		
		Circle object = new Circle();
		System.out.println(object.radius);
		object.radius = 10;
		System.out.println("the radius of the circle given circle is "+object.radius);
		object.area();
		object.diameter();
		object.circumference();

	}

}
