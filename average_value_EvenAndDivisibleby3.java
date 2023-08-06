package javapractise_homeworks.week5;

import org.junit.Test;

import junit.framework.Assert;

public class average_value_EvenAndDivisibleby3 {
	
@Test
public void test1()
{
	Assert.assertEquals(9, averageValue(new int[] {1,3,6,10,12,15}));
	}	

@Test
public void test2()
{
	Assert.assertEquals(0, averageValue(new int[] {1,2,4,7,10}));
	}	
	
	
	public int averageValue(int[] nums) {
	     int denominator=0;
	     int sum=0;
	    

	        for (int i=0;i<=nums.length-1;i++)
	        {
	            if(nums[i]%6==0)
	            {
	                denominator++;
	                sum+=nums[i];
	            }
	        }


	return denominator==0?0:(sum/denominator);
	}
}



