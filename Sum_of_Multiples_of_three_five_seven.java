package javapractise_homeworks.week5;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;

public class Sum_of_Multiples_of_three_five_seven {
	
	@Test 
	public void test1()
	{
		Assert.assertEquals(21,sumOfMultiples(7) );
	}
	
	@Test 
	public void test2()
	{
		Assert.assertEquals(40,sumOfMultiples(10) );
	}
	
	@Test 
	public void test3()
	{
		Assert.assertEquals(30,sumOfMultiples(9) );
	}
	
	
	
	public int sumOfMultiples(int n)
	
	{
		int outputsum=0;
		
		
		for(int i =3;i<=n;i++)
		{
			if((i%3==0)||(i%5==0)||(i%7==0))
			{
				outputsum+=i;
			}
		}
		
		
		return outputsum;
	}

}

/*
 Pseudo Code 
 Input  -> int n 
 Output -> int sum 
 
 Step 1 - Loop from 3 to n 
 
 if (i%3||i%5||i%7==0)
 sum +=i;
 
 return sum
 
 
 */

/*
 https://leetcode.com/problems/sum-multiples/
 
 2652. Sum Multiples
Easy
368
24
Companies
Given a positive integer n, find the sum of all integers in the range [1, n] inclusive that are divisible by 3, 5, or 7.

Return an integer denoting the sum of all numbers in the given range satisfying the constraint.

 

Example 1:

Input: n = 7
Output: 21
Explanation: Numbers in the range [1, 7] that are divisible by 3, 5, or 7 are 3, 5, 6, 7. The sum of these numbers is 21.
Example 2:

Input: n = 10
Output: 40
Explanation: Numbers in the range [1, 10] that are divisible by 3, 5, or 7 are 3, 5, 6, 7, 9, 10. The sum of these numbers is 40.
Example 3:

Input: n = 9
Output: 30
Explanation: Numbers in the range [1, 9] that are divisible by 3, 5, or 7 are 3, 5, 6, 7, 9. The sum of these numbers is 30.
 
 */
