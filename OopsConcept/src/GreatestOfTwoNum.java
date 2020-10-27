
public class GreatestOfTwoNum {
	
	public int greatestNum(int firstNum, int secondNum) {
		
		System.out.println("The Greatest of two nums :" + firstNum + ", " + secondNum);
		int result =0;
		if(firstNum > secondNum) {
			System.out.println(firstNum+" is greater");
			result = firstNum;
		}
		else {
			System.out.println(secondNum +" is greater");
			result = secondNum;
		}
		
		return result;
	}
	

}
