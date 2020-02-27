package com.xworkz.programs;

public class CountObj {
	static int count=0;
	CountObj(){
		count++;
	}
	public static void main(String[] args) {
		
		CountObj obj =new CountObj();
		CountObj obj1 =new CountObj();
		CountObj obj2 =new CountObj();
		CountObj obj3=new CountObj();
		CountObj obj4 =new CountObj();
		CountObj obj5 =new CountObj();
		CountObj obj6 =new CountObj();
		System.out.println("Number of objects created in a class"+count);
		
	}
		
	}


