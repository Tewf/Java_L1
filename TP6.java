package exos;

import java.util.Scanner;

public class TP6 {
 static void rt(int[] x) {
	 for(int i=0;i<x.length;i++) {
		x[i]=(int)(Math.random()*71-20); 
	 }
 }
 static int min(int[]x) {
	 int a= x[0];
	 for(int i=1;i<x.length;i++) {
		if(x[i]<a) {
			a=x[i];
		}
	 }
	 return a;
 }
 static int max(int[]x) {
	 int a= x[0];
	 for(int i=1;i<x.length;i++) {
		if(x[i]>a) {
			a=x[i];
		}
	 }
	 return a;
 }
 
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x= new int[31];
rt(x);

	}

}
