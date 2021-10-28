package week3.day5;

public class polymorphism {

	// Method Overloading

	public void employeeinfo() {
		String name = "mohan";
		System.out.println("Name:  " + name);

	}

	public void employeeinfo(String name, int Empid) {
		System.out.println("Name:  " + name);
		System.out.println("Name:  " + Empid);

	}

	public void employeeinfo(int Empid, String name) {
		System.out.println("Name:  " + name);
		System.out.println("Name:  " + Empid);

	}

	public void employeeinfo(String name, int Empid, int age) {
		System.out.println("Name:  " + name);
		System.out.println("Name:  " + Empid);
		System.out.println("Name:  " + age);

	}

	public static void main(String[] args) {
		
		polymorphism obj=new polymorphism();
		obj.employeeinfo();
		obj.employeeinfo(192, "mohan");
		obj.employeeinfo("raju", 1233);
		obj.employeeinfo("mohan", 1923, 32);

	}

}
