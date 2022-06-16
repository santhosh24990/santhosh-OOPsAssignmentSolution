package com.departments;

public class Main_class {

	public static void main(String[] args)
	{
		Admin_department a= new Admin_department();
		Hr_department b= new Hr_department();
		Tech_department c= new Tech_department();
		
		System.out.println("Welcome to" + a.departmentName());
		System.out.println(a.getTodaysWork());
		System.out.println(a.getWorkDeadline());
		System.out.println(a.isTodayAHoliday());
		System.out.println();
		System.out.println("Welcome to" +b.departmentName());
		System.out.println(b.doActivity());
		System.out.println(b.getTodaysWork());
		System.out.println(b.getWorkDeadline());
		System.out.println(b.isTodayAHoliday());
		System.out.println();
		System.out.println("Welcome to" +c.departmentName());
		System.out.println(c.getTodaysWork());
		System.out.println(c.getWorkDeadline());
		System.out.println(c.getTechStackInformation());
		System.out.println(c.isTodayAHoliday());
		
	}
}
