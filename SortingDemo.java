import java.util.*;

class car implements Comparable
{
	
	String brand;
	public car(String brand, double price) {
		super();
		this.brand = brand;
		this.price = price;
	}
	
	double price;
	
	@Override
	
	public String toString() {
		
		return this.brand + "" + this.price;
		
	}
		public int compareTo(Object o) {
			//int rv=0;
			car cc = (car)o;
			return this.brand.compareTo(cc.brand);
			//if(this.price==cc.price)
			//	rv= 0;
			//else if (this.price<cc.price)
			//	rv= -1;
		//	else if(this.price>cc.price)
			//return rv;
		}
		
	}




public class SortingDemo {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		
		car c1 = new car("Audi", 32659827);
		car c2 = new car("bmw", 32627);
		car c3 = new car("Lamborghini", 32627);
		
		al.add(c1);
		al.add(c2);
		al.add(c3);
		

		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
	}
	

}
