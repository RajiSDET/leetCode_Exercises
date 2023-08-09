package javapractise_homeworks.week5;

import org.junit.Test;

import junit.framework.Assert;

public class day_of_the_year {
	
	@Test
	
	public void test1()
	{
		Assert.assertEquals(9, daysCalculator("2019-01-09"));
	}
	
    @Test
	public void test2()
	{
		Assert.assertEquals(41, daysCalculator("2019-02-10"));
	}
	
	
	
	public int daysCalculator(String date)
	{
		int days[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		int year = Integer.parseInt(date.substring(0, 4));
		int month = Integer.parseInt(date.substring(5, 7));
		int day = Integer.parseInt(date.substring(8));
		
		//Leap year check -> add one more day 
		if(month > 2 && year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
		{
			day=day+1;
		}
		
		// Add the current day + Days from previous month // month = 2
		while((--month)>0) // decrement and then check if it greater > 0 month =1 which is greater than 0
		{
			
			day = day+ days[month-1]; // 10+days[1-1] = 10 + days[0] = 10 + 31
			
		}
		
		return day;
	}

}

/*Pseudo Code
 
 Input - String "YYYY-MM-DD"
 Output - int totaldays
 
 Step 1 : Declare an array days having 12 entries with days of consequtive months 
 Step 2 : Extract year,month,date from input String 
 Step 3 : if month is greater than 2 and year is leap year add -> day = day+1
 Step 4 : While (month>0){day = day + days[month-1]}
 Step 5 : return day
 
 
 
 */
