
public class Cars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Car a= new Car();

		a.setCarDetails("BMW", 213.0, 234.5,true);
		a.print();
		Car b= new Car();
		b.setCarDetails("Audi", 3.0, 234.5,true);
		
		b.print();
		Car c= new Car();
		c.setCarDetails("Volvo", 8.0, 234.5,true);
		c.print();
		Car d= new Car();
		d.setCarDetails("Tea", 3.0, 234.5,false);
		
		
		d.print();
		
		
		if(a.price>b.price && a.price>c.price && a.price>d.price) {
			System.out.println("Costly "+ a.carName);
			
			
			
		}
			if(b.price>a.price && b.price>c.price && b.price>d.price) {
				System.out.println("Costly "+ b.carName);
				
			}
				if(c.price>a.price && c.price>b.price && c.price>d.price) {
					System.out.println("Costly "+ c.carName);
					
				}
					if(d.price>a.price && d.price>b.price && d.price>c.price) {
						System.out.println("Costly "+ d.carName);
		}
	}

			}
