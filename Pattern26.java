package com.qspiders.qwerty;

public class Pattern26 {
	public static void main(String[] args) {
		int n=5;
		for(int i=n;i>=1;i--){
			for(int j=n;j>i;j--){
				System.out.print(" ");
			}
			for(int k=i-1;k>=-(i-1);k--){
				System.out.print(1+4-(Math.abs(k)));
			}
			System.out.println();
		}
	}
}
/*
		123454321
		 2345432
		  34543
		   454
		    5
*/