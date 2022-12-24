package projectClass;
class Demo3{
	int x=10;
	void test() {
		System.out.println("test method is running");
		
	
	}
}

public class ClassProgram3 {
	/* Reference variable syntax is : className variableName = new(key word) className();
	 * ex: Demo3 ob1 = new Demo3();
	 * after that to access we need to use variable is called object
	 * ex: ob1.x
	 * ex: ob1.test();
	 */
	public static void main(String[] args) {
		Demo3 ob1 = new Demo3();
		System.out.println(ob1.x);
		ob1.test();
		ob1.x=30;
		System.out.println(ob1.x);
	}
	

}
