package exos;

import java.util.Scanner;

public class TD5 {
	static char AVANT(String x) {
		return x.charAt(x.length()-2);
	}
	static int max(int x,int y){
		if(x<=y){
			return y;
		}
		else {
			return x;
		}
	}
	static int COUNT(String x) {
		int i=0,s=0;
		while(i<x.length()) {
			if(x.charAt(i)=='*') {
				s++;
			}
			i++;
		}
		return s;
	}
	static boolean IKNOW(String x) {
		int i=0;
		boolean y= false;
		while(i<x.length() && y==false) {
			if(x.charAt(i)=='*') {
				y=true;
			}
			i++;
		}
		return y;}
	static boolean UKNOW(char x) {
		if((int)x <=90 && 65<=(int)x) {
			return true;
		}
		else {
			return false;
		}
	}
	static String together(String x) {
		int i=0;
		String y="";
		while(i<x.length()) {
			if(UKNOW(x.charAt(i))==false) {
				y+=x.charAt(i);
			}
			else {
				y+=".";
			}
			i++;
		}
		return y;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner lecteur =new Scanner(System.in); 
		System.out.print("entrer a\n"); 
		a=lecteur.nextInt();
		System.out.print("entrer b\n"); 
		b=lecteur.nextInt();
		System.out.print(max(a,b)); 

	}

}
