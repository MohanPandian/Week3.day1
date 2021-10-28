package week3.day5;

public class Calculator {

	public void add(int x, int y, int z) {
		int sum = x + y + z;
		System.out.println(sum);

	}

	public void add(int x, int y) {
		int sum = x + y;
		System.out.println(sum);

	}

	public void mul(int x, int y) {
		int mul = x * y;
		System.out.println(mul);

	}

	public void mul(int x, double y) {
		double mul = x / y;
		System.out.println(mul);

	}

	public void sub(double x, double y) {
		double sub = x - y;
		System.out.println(sub);

	}

	public void sub(int x, double y) {
		double sub = x - y;
		System.out.println(sub);

	}

	public void div(int x, int y) {
		int div = x / y;
		System.out.println(div);

	}

	public void div(int x, double y) {
		double div = x / y;
		System.out.println(div);

	}

	public static void main(String[] args) {
		Calculator obj = new Calculator();
		obj.add(1, 2);
		obj.add(1, 4, 5);
		obj.sub(12, 1);
		obj.sub(50, 10);
		obj.mul(30, 10);
		obj.mul(30, 3);
		obj.div(20, 5);
		obj.div(10, 3);

	}

}
