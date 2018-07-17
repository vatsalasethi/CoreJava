
public class Car {
	
	
	String carName;
	double mileage;
	double price;
	boolean luxuryType;
	
	
	public void setCarDetails( String carName, double mileage, double price, boolean luxuryType)
	{
		this.carName= carName;
		this.mileage = mileage;
		this.price = price;
		this.luxuryType = luxuryType;
		
	}

	public void print() {

		System.out.print(carName);
		System.out.print(mileage);
		System.out.print(price);
		System.out.print(luxuryType);
		
		System.out.println("\n");
		}
	

	}

