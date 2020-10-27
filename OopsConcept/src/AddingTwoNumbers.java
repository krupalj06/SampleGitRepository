
public class AddingTwoNumbers {
	
	public static void main(String[] args) {
		System.out.println("Begin prog");
		int a = 10 , b=20 ;
		
		AddingTwoNumbers add = new AddingTwoNumbers();
		int result = add.addition(a, b);
		
		System.out.println("Average is: "+ (result/2));
		
		System.out.println("End of the prog");
	}
	
	public int addition(int x , int y) {
		System.out.println("The first value recived is : " + x);
		System.out.println("The second value recived is : " + y);
		
		int sum = x + y;
		System.out.println("Sum of "+ x + " & " + y + " is:" + sum);
		
		return sum ; 
	}
	

}
