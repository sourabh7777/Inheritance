package inheritance;

public class ChildClass extends BaseClass{
	public void mul() {
		System.out.println("child class multiplication method is called");
	}
	public void div() {
		System.out.println("child class division method is called");
	}
	
	public static void main(String[] args) {
		
		//Child class Reference and child class object
		ChildClass obj1 = new ChildClass();
		obj1.add();
		obj1.div();
		obj1.mul();
		obj1.substract();
		
		
		System.out.println("=============");
		BaseClass obj2 = new BaseClass();
		
		obj2.add();
		obj2.substract();
		

	}

}
