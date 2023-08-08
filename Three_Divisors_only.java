package javapractise_homeworks.week5;

import org.junit.Test;

import junit.framework.Assert;

public class Three_Divisors_only {

	@Test
	public void test1() {
		Assert.assertEquals(false, isThree(5));
	}

	@Test
	public void test2() {
		Assert.assertEquals(false, isThree(1));
	}

	@Test
	public void test3() {
		Assert.assertEquals(false, isThree(0));
	}

	@Test
	public void test4() {
		Assert.assertEquals(false, isThree(81));
	}

	public boolean isThree(int n)
	{
		
		if(n<0)
		{
			n*=-1;
		}
		
		if(n<4)
		{
			return false;
		}
		
		int sqr_root = (int) Math.sqrt(n);
		boolean isPrime = true;	
		
		if(sqr_root*sqr_root==n)
		{
			for (int i = 2;i<=sqr_root/2;i++)
			{
				if(sqr_root%i==0)
				{
					isPrime= false;
				}
			}
		}
		else {
			return false;
		}
		
		return isPrime?true:false;
		
		
		
	}
	
	
	
}

/*
 * 
 * Pseudo Code
 * 
 * Input - int n 
 * Output -boolean 
 * true if number has exactly 3 divisors
 * false if more than or less than 3 divisors 
 * 
 * 1 ->1 
 * 2-> 1,2 
 * 3-> 1,3 
 * 4-> 1,2,4 (2^2) 
 * 6-> 1,2,3,6 
 * 8-> 1,2,4,8 
 * 9 -> 1,3,9(3^2) 
 * 10 -> 1,2,5,10 
 * 25 -> 1,5,25 (5^2) 
 * 49 -> 1,7,49 (7^2)
 * 121 -> 1,11,121 (11^2)
 * 
 * 
 * Prime numbers will have only 2 divisors for sure Only the squares of prime number have exactly 3 divisors
 * 
 * Step 1 : if the number is negative make it positive 
 * Step 2 : get the sqr_root : Extract the 2 - square root of given number using-> Math.sqrt(num); 
 * Step 3 : Output Range starts from 4 only so if n<4 directly return false 
 * Step 4 : Set a boolean flag isPrime as true by default to start with 
 * Step 5 : Check if the sqr_root * sqr_root  == n only then enter the loop to check if the number is prime 
 * Step 6 : If sqr_root is prime - Return true else return false 
 * 
 * 
 */
