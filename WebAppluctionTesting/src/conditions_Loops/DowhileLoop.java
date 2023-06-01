package conditions_Loops;

public class DowhileLoop {

	public static void main(String[] args) {
		int var=5;
		
		do
		{
			System.out.println(var + " Selenium ");
			var++;
		}while(var<6);
		
		System.out.println(" ######################## ");
		
		do
		{
			System.out.println(var +" LoadRunner ");
			var++;
		}while(var<=8);
		
		System.out.println(" ^^^^^^^^^^^^^^^^^^^^^ ");

		do
		{
			System.out.println(var+" Jmeter");
			var=var-2;
		}while(var<=6);
	}
}

