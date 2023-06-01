package conditions_Loops;

public class WhileLoop {

	public static void main(String[] args) {
		int var=4;
		while(var<=6)
		{
			System.out.println(" Selenium ");
			
			var++;
		}
		
		System.out.println(" $$$$$$$$$$$$$$$ ");

		while(var<=8) //the current value of the the variable var is - 7 (from the above loop)
		{
			System.out.println(var+" LoadRunner ");
			
			var=var+1;
		}
		
		System.out.println(" %%%%%%%%%%%%%%%%%%%%%%%% ");
		
		int i=8;
		while(i>=3)
		{
			System.out.println(i+" Jmeter ");
			i=i-2;
		}
				
	}
}

