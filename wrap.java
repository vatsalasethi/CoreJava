
public class wrap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String company="Deloitte works for 9 hours *";
		char a[]=company.toCharArray();
		for(int i=0; i<company.length(); i++)
		{
				char x=a[i];
				if(Character.isDigit(x))
					System.out.println(x + " is a digit");
				else if(Character.isLetter(x))
					System.out.println(x + " is a digit");
				else if(Character.isDigit(x))
					System.out.println(x + " is a digit");
				else if(Character.isWhitespace(x))
					System.out.println(x + " is a whitespace");
				else 
					System.out.println(x + " Special Character");
				
		}
		
}
}
