
public class FruitTester {
	
	public static void main(String[] args) {
		
		System.out.println("Details of Apple: ");
		
		Fruit appleFruit = new Fruit(); //instance 

		appleFruit.color = "Red";
		appleFruit.name = "Apple";
		appleFruit.price = 200.00;
		appleFruit.taste = "Sweet"; 
		appleFruit.weight = 1;
		
		
		System.out.println("Name of fruit: " + appleFruit.name);
		System.out.println("Color of fruit: "+ appleFruit.color);
		System.out.println("Taste of fruit: "+ appleFruit.taste);
		System.out.println("price of fruit: "+ appleFruit.price);
		System.out.println("Weight of fruit: "+ appleFruit.weight);
		
		appleFruit.growing();
		appleFruit.ripe();
		
		
		System.out.println("Details of orange :");
		
		Fruit orangeFruit = new Fruit();
		
		System.out.println("Name of fruit: " + orangeFruit.name); // ""
		System.out.println("Color of fruit: "+ orangeFruit.color); //
		System.out.println("Taste of fruit: "+ orangeFruit.taste);
		System.out.println("price of fruit: "+ orangeFruit.price);
		System.out.println("Weight of fruit: "+ orangeFruit.weight);
		orangeFruit.growing();
		orangeFruit.ripe();
		
		
	}

}
