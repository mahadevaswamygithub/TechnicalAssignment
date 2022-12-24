package projectClass;

class Demo5{
	Demo5(){
		System.out.println("the constroctor is running");
	}
}

public class ConstroctorPro1 {
	public static void main(String[] args) {
		Demo5 ob1 = new Demo5();
		for(int i = 0; i<=5; i++) {
			new Demo5();
		}
	}

}
