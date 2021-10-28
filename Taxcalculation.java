package week3.day5;

public interface Taxcalculation {

//Interface Implementation class	

    //no method body we called it as unimplemented methods
	//it will not enclose with {}
	//understanding will be in comments line for documentation of an interfaces
		
	/**
	 * this method calculates the deductiom of a person
	 * author mohan
	 * @param name
	 * @param HRA
	 * @param LTA
	 */
	 
	void calcdeductions(String name,double HRA,double LTA);
	
	//for writting code i need to create an class
	
	void calcGross(String name,double netincome,double deductions);

}

