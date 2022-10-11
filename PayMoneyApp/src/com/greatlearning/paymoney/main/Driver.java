package com.greatlearning.paymoney.main;
import java.util.*;

public class Driver {
	
	private static int getNoofTransactions(int [] transArray, int Target) {
		
		int sum=0;
		for(int i=0;i<transArray.length;i++) {
			sum+=transArray[i];
			if (sum>=Target)
			{
				return i+1;
			}
		}return -1;
		
		
	}
	
public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	System.out.println("Please input number of transactions : ");
	int noofTransactions=s.nextInt();
	
	int[] transArray=new int[noofTransactions];
	System.out.println(" Enter the transaction value : ");
	for (int i=0; i<noofTransactions ; i++) 
	{
		transArray[i]=s.nextInt();
		
	}
//System.out.pritnln(" Please enter number of targets ");
	System.out.println(" Please enter number of targets ");
	int noofTargets = s.nextInt();
	
	for(int i=0; i<noofTargets; i++) {
		
		System.out.println(" Enter the target  " +(i+1));
		int target= s.nextInt();
		int transcount = getNoofTransactions(transArray,target);
		if(transcount<0)
		{
			System.out.println("Target not achieved");
		}else
		{
			System.out.println(" Target achieved in "+transcount+" targets ");
		}
	}
	
	
}
	}


