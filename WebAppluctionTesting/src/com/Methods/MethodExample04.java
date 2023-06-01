package com.Methods;

public class MethodExample04 {
	//global variable/instance variable
	int var3;
	public void maa() {	//methods with parameters
		int var
		=10;
		int 
		var1=20;
		var3=var+var1;//var3 is not declared-its taking the declaration of the global variable
		System.out.println("the number of two value var and var1 is:-"+var3);	
	}
	public void addition(int var1,int var2,int var3){
		//same method names with different method signature
		int var4=var1*var2-var3;
		System.out.println("the nubers of addition is:-"+var4);
	}
	public void addition(double var1,float var2) {
		double var3;
		var3=var1*var2;
		System.out.println("the value of two number is:-"+var3);	
	}
	//global variable
	int var1=80;
	int var2=60;
	
	public void subtraction() {//consider the values which are declared outside methods
		var3=var1-var2;
		System.out.println("the number of subtraction is:-"+var3);
	}
public static void main(String[] args) {
	
	MethodExample04 AL=new MethodExample04();
	MethodExample01 maa=new MethodExample01();
	maa.MA();
	AL.maa();
	AL.addition(20, 40, 25);
	AL.addition(20.123, 25.234f);
	AL.subtraction();
	AL.mms();
	MethodExample02 mm=new MethodExample02();
	mm.subtraction();
   }
public void mms() {
	 String vara="maheboob";
	    String varm="Hero";
	    String vas;
	    vas=vara; vas=varm;
	System.out.println("  "+vara+"  "+vas);
}
   
}
