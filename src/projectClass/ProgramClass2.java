package projectClass;

class Demo2{
	int y =10;
	void desc() {
		System.out.println("desc() method is running");
	}
}
public class ProgramClass2 {

	public static void main(String[] args) {
		System.out.println("the value of y is"+new Demo2().y);
		new Demo2().desc();
        new Demo2().y=20;
        System.out.println("the reinitialize value of Y is"+ new Demo2().y);

	}

}
