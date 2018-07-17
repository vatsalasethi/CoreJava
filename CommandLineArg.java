
 class CommandLineArg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum=0;
		System.out.println(args.length);
		for(int i=0; i<args.length; i++)
		{
			sum= sum+ Integer.parseInt(args [i]);
			
		}System.out.println(sum);
	}

}

 