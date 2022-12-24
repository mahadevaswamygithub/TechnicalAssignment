package projectClass;
class Demo6{
	//Constructor without parameter
	//Declaration of non static variable/instance variable
	int x;
	int y;
	Demo6(){
		x=10;
		y=20;
	}
}
public class ConstructorPro2 {

	public static void main(String[] args) {
		Demo6 var1 = new Demo6();
		System.out.println(var1.x);
		System.out.println(var1.y);
		Demo6 var2 = new Demo6();
		System.out.println(var2.x);
		System.out.println(var2.y);
		

	}

}
