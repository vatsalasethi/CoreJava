
public class passwordValidator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			String pwd= "Vatsal1";
		
			if(pwd.length()>5 && pwd.length()<10)
	{
			char a[]=pwd.toCharArray();
			for(int i=0; i<pwd.length(); i++)
			{
				char x=a[i];
				{	if(Character.isDigit(x))
					continue;
					else System.out.println("At least Need a digit");;
				}
				{ if(Character.isUpperCase(x))
						continue;
					else System.out.println("At leastUppercase needed");
				}	
					
				{ if(Character.isWhitespace(x))
					System.out.println("No whitespace pls");
				}
				
			
				
		
				
			}
			
	}
			
			else {System.out.println("Min 5 letters and Max 10 letters");
}}}
