package conditions_Loops;

public class NestedLoop {

public static void main(String[] args) {
		
		for(int i=1;i<=3;i++) // Outer Loop
		{
			for(int j=1;j<=i;j++) // Inner Loop
			{
				System.out.println(i+" Testing ");
			}
		}
		
		System.out.println(" ######################### ");
		
		for(int i=1;i<=3;i++) // Outer Loop
		{
			for(int j=1;j<=i;j++) // Inner Loop
			{
				System.out.println(j+" Testing ");
			}
		}
		
		System.out.println(" &&&&&&&&&&&&&&&&&&&&& ");
		
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
		
		System.out.println(" @@@@@@@@@@@@@@@@@@@@@@@@ ");
		
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" 1 ");
			}
			System.out.println();
		}
		
		System.out.println("#######################" );
		
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		

		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
		
		System.out.println(" @@@@@@@@@@@@@@@@@@@@@@@@ ");
		

		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+3);
			}
			System.out.println();
		}
		
		System.out.println(" !!!!!!!!!!!!!!!!!!!!!!!!!!!!! ");
/*
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=i;j=j-2)
			{
				System.out.print(i+3);
			}
			System.out.println();
		}
	*/
		System.out.println(" $$$$$$$$$$$$$$$$ ");
		int a=7;
		
		for(int i=3;i>0;i--)
		{
			for(int j=i;j>0;j--)
			{
				
				System.out.print(a--);
			}
			System.out.println();
			
			
		}
		
		System.out.println(" %%%%%%%%%%%%%%%%%%% ");

		for(int i=4;i>=3;i=i-1)
		{
			for(int j=7;j>i;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
		
		
	}
}

