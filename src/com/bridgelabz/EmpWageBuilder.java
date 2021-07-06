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
	    	 int dailyWage;
	         double empCheck=Math.floor(Math.random()*10)%3;
	         switch ((int)empCheck) {
	             case IS_EMP_PRESENT_FULLTIME:
	                 System.out.println("employee is present");
	                 dailyWage=(EMP_WAGE_PER_HOUR*FULL_WORK_HOUR);
	                 System.out.println("salary is:"+dailyWage);
	                 break;
	             case IS_EMP_PRESENT_PARTTIME:
	                 dailyWage=(EMP_WAGE_PER_HOUR*PART_WORK_HOUR);
	                 System.out.println("salary is :"+dailyWage);
	                 System.out.println("employee is part time present");
	                 break;
	             default:
	                 System.out.println("when employee is absent for the day his salary is zero");
	         }
	     }
	 }