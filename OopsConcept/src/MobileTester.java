
public class MobileTester {

	public static void main(String[] args) {  //Calling method
		
		System.out.println("Begin creating Mobile");
		
//		int i = 10;
		Mobile onePlusSix = new Mobile();   // Mobile object /  instance
		onePlusSix.os = "Andriod";
		onePlusSix.company = "OnePlus";
		onePlusSix.camPixel = 16.00f;
		onePlusSix.ramInGB = 4;
		onePlusSix.price = 32000;
		
		
		long phonenum = 9876543210l;
		
		onePlusSix.calling(phonenum);  //Calling a Method 
		onePlusSix.takingPic();
		onePlusSix.gaming();
		
		
		Mobile iPhone11 = new Mobile();
		iPhone11.os = "IOS";
		iPhone11.company = "Apple";
//		iPhone11.camPixel..
		//..
		
		System.out.println("Ending creating Mobile");
	}

}
