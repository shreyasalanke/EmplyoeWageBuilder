package com.bridgelabz;

import java.util.Random;

public class EmpWageBuilder {
	
	    public static final int IS_EMP_PRESENT_FULLTIME = 1;
	    public static final int IS_EMP_PRESENT_PARTTIME = 2;
	    public static final int EMP_WAGE_PER_HOUR = 20;
	    public static final int FULL_WORK_HOUR = 8;
	    public static final int PART_WORK_HOUR = 4;
	    public static final int NUM_OF_WORKING_DAYS = 20;
		
	    public static void main(String[] args) {
	    	 int empHrs=0;
	         int dailyWage;
	         int totalWage = 0;
	         int totalWorkingHrs = 0;
	         for (int i=1;i<NUM_OF_WORKING_DAYS;i++){
	             double empCheck=Math.floor(Math.random()*10)%3;
	             switch ((int)empCheck) {
	                 case IS_EMP_PRESENT_FULLTIME:
	                     empHrs=8;
	                     break;
	                 case IS_EMP_PRESENT_PARTTIME:
	                     empHrs=4;
	                     break;
	                 default:
	                     empHrs=0;
	             }
	             if (totalWorkingHrs==100 || i==20)
	             {
	                 break;
	             }
	             dailyWage=(EMP_WAGE_PER_HOUR*empHrs);
	             totalWage+=dailyWage;
	             totalWorkingHrs+=empHrs;
	         }
	         System.out.println("Salary per month is:"+totalWage);
	     }
	 }