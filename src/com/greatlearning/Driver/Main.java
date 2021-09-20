package com.greatlearning.Driver;
import java.util.Scanner;
import com.greatlearning.SortingUtility.CurrencyCounter;
import com.greatlearning.SortingUtility.MergeSort;

public class Main 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of currency denominations");
		int size = scan.nextInt();
		System.out.println("Enter the currency denominations value");
		int[] denominations = new int[size] ;
		for(int i = 0 ; i < denominations.length ; i++)
		{
			denominations[i] = scan.nextInt();
		}
		
		MergeSort msort = new MergeSort();
		msort.sort(denominations, 0 , denominations.length - 1);
		System.out.println("Enter the amount you want to pay");
		int amount = scan.nextInt();
		System.out.println();
		CurrencyCounter ccy = new CurrencyCounter();
		ccy.minimumCountOfCurrency(amount, denominations);		
		
	}	
}
