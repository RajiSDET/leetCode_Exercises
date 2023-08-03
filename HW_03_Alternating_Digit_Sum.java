package javapractise_homeworks.week5;

import org.junit.Test;

import junit.framework.Assert;

public class HW_03_Alternating_Digit_Sum {
	
	@Test
	public void test1()
	{
		Assert.assertEquals(4, ADS(521));
	}
	@Test
	public void test2()
	{
		Assert.assertEquals(1, ADS(111));
	}
	@Test
	public void test3()
	{
		Assert.assertEquals(0, ADS(886996));
	}
	
	public int ADS(int n)
	{
        int sum =0;
		
		String temp = Integer.toString(n);
		int[] intArray= new int[temp.length()];
		for (int i = 0; i < temp.length(); i++) 
		{
			if(i%2!=0)
			{
				intArray[i]=-1*(temp.charAt(i)-'0');
								
			}
			else 
			{
				intArray[i]=(temp.charAt(i)-'0');
			}
			
			sum+=intArray[i];
		}
		return sum;
	}
	
}
