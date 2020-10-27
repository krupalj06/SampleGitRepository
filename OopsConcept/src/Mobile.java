
public class Mobile {

	// State ->company, OS, ram, campixel ---> fields/ instance variable /data
	// members

	String company;
	String os;
	int ramInGB;
	float camPixel;
	double price;

	// Behaviours->calling, takingPic, gaming --> methods / functions

	//modifier returnType methodName(parameter list)
	public void calling(long phoneNum) {
		System.out.println("Calling..." + phoneNum);
	}

	public void takingPic() {
		System.out.println("Pic is been taken ");
	}

	public void gaming() {

		System.out.println("Playing games");
	}

}
