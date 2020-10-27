
public class OddEvenNumber {
	
	public static void main(String[] args) { //Calling method /function
		
		System.out.println("Prog to Find the num is odd or even :");
		
		int num1 = 53, num2 =64 ;
		
		OddEvenNumber oddEven = new OddEvenNumber();
		oddEven.findOddOrEven(num1); // argument
		oddEven.findOddOrEven(num2);
		
		
		String str = "name";
		
		oddEven.findOddOrEven(10);
		
		System.out.println("End of Prog");
		
	}
	
	public void findOddOrEven(int num) {  //parameter
		if(num %2 == 0) {
			System.out.println("The num "+ num + " is Even ");
		} else { 
			System.out.println("The num "+ num + " is Odd ");
		}
		
	}
	

}
