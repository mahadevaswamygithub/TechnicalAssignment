package projectClass;
class Demo4{
	static int x=10;
	int y=20;
	static void printXValue() {
		System.out.println("X value is"+x);
		//System.out.println("y value is"+y);
	}//non static method can access non static member of the same class without object
	void printXYValues() {
		System.out.println("x value is"+x);//non-static method can access static member
		System.out.println("y value is"+y);
	}
	
}

public class NonStatic1 {

	public static void main(String[] args) {
		System.out.println(Demo4.x);
		System.out.println(new Demo4().x);
		Demo4.printXValue();
		Demo4 var = new Demo4();
		var.printXYValues();
		
	}

}
