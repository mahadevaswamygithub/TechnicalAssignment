package projectClass;

class Demo1{
	static int x=10;
	static void test() {
		System.out.println("the test() method is running");
	}
}
public class ProgramClass1 {
	public static void main(String[] args) {
		System.out.println("main method is started");
		System.out.println(Demo1.x);
		Demo1.test();
		Demo1.x=20;
		System.out.println("the reinitialize value of X is"+Demo1.x);
		System.out.println("main method is ended");
		
	}

}
