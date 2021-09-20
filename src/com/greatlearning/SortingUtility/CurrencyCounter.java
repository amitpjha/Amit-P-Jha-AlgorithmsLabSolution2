package com.greatlearning.SortingUtility;

public class CurrencyCounter 
{
	public void minimumCountOfCurrency(int amount , final int[] denominations)
	{
		int[] count = new int[denominations.length];
		for(int i = 0 ; i < denominations.length ; i++)
		{
			if(amount >=denominations[i])
			{
				count[i] = amount/denominations[i];
				amount = amount - count[i]*denominations[i] ;
			}
		}
		
		System.out.println("Your payment approach in order to give min no of notes will be");
		
		for(int i = 0 ; i < denominations.length ; i++)
		{
			if(count[i] != 0)
			{
				System.out.println(denominations[i] + ":" + count[i]);
			}
		}
	}

}
