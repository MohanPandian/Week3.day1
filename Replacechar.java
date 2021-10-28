package week3.day5;

public class Replacechar {

	public static void main(String[] args) {
		String str="I am working with Java9";		
		String strRep=str.replace("9","11");
		strRep=strRep+'#';
		System.out.println("The string before replacement :" + str);
		System.out.println("The string after replacement :"+strRep);
		
		System.out.println("Print string between 5 and 14 : "+strRep.substring(5,15));
	}

}
