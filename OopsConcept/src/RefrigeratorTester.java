
public class RefrigeratorTester {
	
	public static void main(String[] args) {
		
		System.out.println("Begin prog");
		
		Refrigerator samRef = new Refrigerator(); // calling no-arg Constructor
		System.out.println("height of samsung: "+ samRef.height); // 0
		System.out.println("capacity of samsun: "+ samRef.capacityLt); // 0
		System.out.println("Brand of Samsun: " + samRef.brand); // null
		
		samRef.cooling(0);
		
		
		Refrigerator lgRef = new Refrigerator(4, 275, "LG", 2); //calling 4 arg-const
		
		System.out.println("height of LG: "+ lgRef.height); 
		System.out.println("capacity of LG: "+ lgRef.capacityLt); 
		System.out.println("Brand of LG: " + lgRef.brand); 
		
		System.out.println("End prog");
	}

}
