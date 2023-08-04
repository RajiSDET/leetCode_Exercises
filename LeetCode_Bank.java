package javapractise_homeworks.week5;

import org.junit.Assert;
import org.junit.Test;

public class HW_04_LeetCode_Bank {
	
	@Test
	public void test1()
	{
		Assert.assertEquals(10, balance(4));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(63, balance(14));
	}
	
	@Test
	public void test3()
	{
		Assert.assertEquals(66, balance(15));
	}
	
	public int balance (int n) 
	{
		int balance = 28;
		int weeks = n/7; 
		int days = n%7; 
		
		if(n<=7) 
		{
	    balance= n*(n+1)/2;
		return balance ;
		}
		
		else 
		{
			for (int i=1;i<=weeks-1;i++)
			{
				balance+=(i*7)+28;
			}
			
			if(days!=0)
			{
				for (int i =1;i<=days;i++)
				{
					balance+=weeks+i;
				}
			}
			
		}
		
		return balance;
	}
	
	
}

/*Pseudo Code 
 
 Input = int particularday;
 Output = int TotalAccBalance;
 
 number of weeks => particularday/7 = quotient = total number of weeks 
 remaining number of days = particularday%7 = remainder = number of days beyond the week 
 
 Remember sum of n natural numbers = n * ((n+1)/2)
 ie : sum of 1,2,3,4,5,6,7 = 7 * (7+1)/2 = 7*4 = 28; 
 Week 1 sum = (1+2+3+4+5+6+7) = 28 
 Week 2 sum = (2+3+4+5+6+7+8) = (1*7)+28 = 35; one $ more per day than the previous week everyday 
 Week 3 sum = (2+3+4+5+6+7+8) = (2*7)+28 = 42; one $ more per day than the previous week everyday 
 .
 .
 .
 Week n sum = ((n-1)*7)+28 
 
 Using same formula - trying to derive for next few remaining days in upcoming week 
  
 remaining days sum = ((n)*remaining days)+28 -- Not sure on this formula - Check during run time 
 
 iterate the loop i from 1 to n-1
 
 TotalAccBalance = TotalAccBalance+((i)*7)+28

 if (particularday%7!=0)
 {
   TotalAccBalance = TotalAccBalance + ((n)*7)+28
 }
 
 

 * */

/* https://leetcode.com/problems/calculate-money-in-leetcode-bank/
 
 1716. Calculate Money in Leetcode Bank

Hercy wants to save money for his first car. He puts money in the Leetcode bank every day.
He starts by putting in $1 on Monday, the first day. Every day from Tuesday to Sunday, he will put in $1 more than the day before. On every subsequent Monday, he will put in $1 more than the previous Monday.
Given n, return the total amount of money he will have in the Leetcode bank at the end of the nth day.

Example 1:

Input: n = 4
Output: 10
Explanation: After the 4th day, the total is 1 + 2 + 3 + 4 = 10.
Example 2:

Input: n = 10
Output: 37
Explanation: After the 10th day, the total is (1 + 2 + 3 + 4 + 5 + 6 + 7) + (2 + 3 + 4) = 37. Notice that on the 2nd Monday, Hercy only puts in $2.
Example 3:

Input: n = 20
Output: 96
Explanation: After the 20th day, the total is (1 + 2 + 3 + 4 + 5 + 6 + 7) + (2 + 3 + 4 + 5 + 6 + 7 + 8) + (3 + 4 + 5 + 6 + 7 + 8) = 96.

 */