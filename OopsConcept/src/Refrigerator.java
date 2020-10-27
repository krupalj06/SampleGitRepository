
public class Refrigerator {
	
	int height;
	int capacityLt; 
	String color;
	String brand;
	int noOfDoors;
	boolean ecoFriendly;
	double price;
	
	public Refrigerator(){  //no-argument constructor
		System.out.println("Initializing");
	}
	//One-parm const
	//2-parm const
	//All parm const
	
	public Refrigerator(int inHeight , int inCapacity, String inBrand, int inNoOfDoor){
		System.out.println("Initilalizing height , capacity and brand");
		height = inHeight;
		capacityLt = inCapacity;
		brand = inBrand;
		noOfDoors = inNoOfDoor;
	}
	
	public void cooling(int temp) {
		System.out.println("cooling to temp: "+ temp);
	}

	public void freezing() {
		System.out.println("Freezing");
	}
 }
