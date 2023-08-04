package javapractise_homeworks.week5;

import org.junit.Test;

import junit.framework.Assert;

public class Sign_of_Product_of_Array 

{
	
	@Test
	public void test1()
	{
		Assert.assertEquals(1, arraySign(new int[]{-1,-2,-3,-4,3,2,1}));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(0, arraySign(new int[]{1,5,0,2,-3}));
	}
	@Test
	public void test3()
	{
		Assert.assertEquals(-1, arraySign(new int[]{-1,1,-1,1,-1}));
	}
	
	public int arraySign(int[] nums) {
        int negnumcount =0;

        for (int i=0;i<nums.length;i++)
        {
           if(nums[i]<0)
           {
              negnumcount++; 
           }

           if(nums[i]==0)
           {
             return 0;
           }
        }
        if(negnumcount%2!=0)
        {
            return -1;
        }
        
       return 1;
    }

	
	
}

/*Pseudo Code 
1. Initialize a negetive number counter - Get the count of negative numbers 
2.Iterate /  scan through the array  - 
Extract the actual count of negative numbers
if any number in array is zero directly return 0;
if count of negative is even - final result will be positive so return 1
if count of negative is odd - final result will be negative so return -1
 */

/*1822. Sign of the Product of an Array
Easy
2K
194
Companies
There is a function signFunc(x) that returns:

1 if x is positive.
-1 if x is negative.
0 if x is equal to 0.
You are given an integer array nums. Let product be the product of all values in the array nums.

Return signFunc(product).

 

Example 1:

Input: nums = [-1,-2,-3,-4,3,2,1]
Output: 1
Explanation: The product of all values in the array is 144, and signFunc(144) = 1
Example 2:

Input: nums = [1,5,0,2,-3]
Output: 0
Explanation: The product of all values in the array is 0, and signFunc(0) = 0
Example 3:

Input: nums = [-1,1,-1,1,-1]
Output: -1
Explanation: The product of all values in the array is -1, and signFunc(-1) = -1*/
