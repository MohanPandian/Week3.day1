package week3.day5;

public class Execution {

	public static void main(String[] args) {

		
		System.out.println("BMW");
		
		Bmw bw = new Bmw();
		bw.accelerate();
		bw.drivevehicle();
		bw.Enableairbag();
		bw.shiftgear();
		bw.fillfuel();
		bw.closedoor();
		bw.applybrake();

		System.out.println("car wheel count" + bw.wheelcar);

		
		System.out.println("AUDI");
		
		Audi ad = new Audi();
		ad.accelerate();
		ad.drivevehicle();
		ad.Enableairbag();
		ad.shiftgear();
		ad.fillfuel();
		ad.closedoor();
		ad.applybrake();

		System.out.println("car wheel count" + ad.wheelcar);
		
		System.out.println("BAJAJ");
		
		Bajaj bj = new Bajaj();
		bj.accelerate();
		bj.drivevehicle();
		bj.shiftgear();
		bj.fillfuel();
		bj.applybrake();

		System.out.println("car wheel count" + bj.wheelAuto);

	}

}
