package com.xworkz.programs;

public class Reverse {
	public void reverse(String str) {
		String[] name=str.split(" ");
		String  revString="";
		for(int i=0;i<name.length;i++) {
			String s1=name[i];
			String reverseword="";
			for(int j=s1.length()-1;j>=0;j--) {
				reverseword=reverseword+s1.charAt(j);
				
			}
			revString=revString+reverseword+" ";
		}
		System.out.println(str);
		System.out.println(revString);
	}
	public static void main(String[] args) {
		Reverse obj=new Reverse();
		obj.reverse("welcome to xworkz");
		}
	
}
