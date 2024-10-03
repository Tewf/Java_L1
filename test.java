package exos;

import java.util.Scanner;

public class test {
	static int nega(Double[] x) {
		int y=0;
		for(int i=0;i<x.length;i++) {
			if(x[i]<=0) {
				y++;
			}
		}
		return y;
	}
	static char randchar() {
		return(char)((int)(Math.random()*26)+65);
	}
	static String repeat(String x, int y) {
		String s="";
		for(int i=0;i<y;i++) {
			s=s+x;
		}
		return s;
	}
	static int nbcom(String x,String y) {
		int z=0;
		for(int i=0;i<x.length();i++) {
			if(x.charAt(i)==y.charAt(i)) {
				z++;
			}
		}
		return z;
	}
	static boolean tousavant(String x,char y) {
		for(int i=0;i<x.length();i++) {
			if((int)(x.charAt(i))<=(int)(y)) {
				return false;
			}
		}
		return true;
	}
	static char convert(char x) {
		return (char)(((int)(x)-44)%26+65);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String y="",a;
		System.out.println("enter the string");
		Scanner s =new Scanner(System.in);
		a=s.nextLine();
		for (int i=0;i<a.length();i++){
			if((int)(a.charAt(i))<=90) {
				y=y+convert(a.charAt(i));
			}
			else {
				y=y+a.charAt(i);
			}
		}
		System.out.println(y);
	}

}
