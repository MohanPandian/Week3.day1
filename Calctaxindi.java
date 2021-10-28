package week3.day5;

//implementation calls that is going to implement interface

public class Calctaxindi implements Taxcalculation, Incomecalc {

	// by clicking on classname and add implemented methods

	public void calcdeductions(String name, double HRA, double LTA) {
		System.out.println("Calctaxindi");

	}

	public void calcGross(String name, double netincome, double deductions) {
		System.out.println("Calctaxindi-grow");

	}

	public void slab() {

		System.out.println("Calctaxindi-slab");

	}

	public void calcgrossincome(String name, double HRA, double LTA) {
		System.out.println("Calctaxincgross");

	}

	public static void main(String[] args) {

		Calctaxindi objind = new Calctaxindi();
		objind.calcdeductions("Ram", 100440, 1000434);
		objind.calcGross("Ram", 10003, 10030);
		objind.slab();
		objind.calcgrossincome("Ram", 10003, 10030);

		// going to create class for interface
		// Taxcalculation obj=new Taxcalculation()
		// java donesnt allow to craete class for an interface

	}

}
