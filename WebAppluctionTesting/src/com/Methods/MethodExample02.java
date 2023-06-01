package com.Methods;

import org.apache.poi.util.SystemOutLogger;

public class MethodExample02 {
	public void addition() {
		int MA=10;
		int MA1=20;
		int MA2;
		MA2=MA1+MA;
		System.out.println("the result of two numbers MA1 && Ma is:-"+MA2);
	    }
	public static void main(String[] args) {
		MethodExample02 AM=new MethodExample02();
		AM.addition();
		AM.division();
		AM.subtraction();
		AM.multiplication();
	}
	private void division() {
		int MA=5;
		int MA1=20;
		int MA2;
		MA2=MA1/MA;
		System.out.println("the result of two division is:-"+MA2);
	    }
	protected void subtraction()
	{
		int MA=10;
		int MA1=20;
		int MA2;
		MA2=MA1-MA;
		System.out.println("the result of two subtraction is:-"+MA2); 
	}
	 void multiplication() {
		 int MA=10;
		 int MA1=20;
	   	 int MA2;
		 MA2=MA1*MA;
		 System.out.println("the result of two multiplication is:-"+MA2); 
		}
		 
		
	}
	

