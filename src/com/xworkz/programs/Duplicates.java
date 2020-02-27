package com.xworkz.programs;

import java.util.Arrays;

public class Duplicates {
	static String removeDuplicate(char str[],int n) {
		int X=0;
		for(int i=0;i<n;i++) {
			int j;
			for(j=0;j<i;j++) {
				if(str[i]==str[j]) {
					break;
				}
			}
	if(j==i) {
		str[X++]=str[i];
	}
		}
		
		
		return String.valueOf(Arrays.copyOf(str,X));
	}
	public static void main(String[] args) {
		char str[]="snehaandswathi".toCharArray();
		int n=str.length;
		System.out.println(removeDuplicate(str, n));
	}

}
