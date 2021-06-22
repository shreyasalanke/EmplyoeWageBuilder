package com.bridgelabz;

import java.util.Random;

public class EmpWageBuilder {
	
	
	public static void main(String[] args) {
		
		int IS_EMP_PRESENT = 1;
		int EMP_WAGE_PER_HOUR = 20;
		int FULL_DAY_HOUR = 8;
		
		double empCheck =Math.floor(Math.random()*10)%2;
		
		if (empCheck == IS_EMP_PRESENT )
		{
			System.out.println("emp is prsent");
			int dailyEmpWage = EMP_WAGE_PER_HOUR * EMP_WAGE_PER_HOUR;
			System.out.println("emp wage is:"+dailyEmpWage);
		}
		else
		{
			System.out.println("emp absent");
			int dailyEmpWage = 0;
			
				
		}
		
			
	}	

}
