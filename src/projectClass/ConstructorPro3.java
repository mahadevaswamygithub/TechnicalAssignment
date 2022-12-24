package projectClass;
import java.util.*;
class Demo7{
	//Declaration of non- static variable/Instance variable
	int x;
	int y;
	Demo7(int args1,int args2){
		//Constructor with parameter
		x=args1;
		y=args2;
	}
	void dispalyValue() {
		System.out.println("Argument is 1"+x+"and"+"argumnet 2 is"+y);
	}
}
public class ConstructorPro3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the argument1 is");
		int args1 = sc.nextInt();
		System.out.println("enter the argument 2 is ");
		int args2 = sc.nextInt();
		Demo7 var1 = new Demo7(args1,args2);
		var1.dispalyValue();
		
	}

}
