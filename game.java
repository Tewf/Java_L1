package exos;

import java.util.Scanner;

public class game {
static int[] decise(char x, int y) {
	if(x=='s') {
		if(y==1) {
			int[] a= {1,1};
			return a;
		}
		else {
			int[] a= {0,5};
			return a;
		}
	}
	else {
		if(y==1) {
			int[] a= {5,0};
			return a;
		}
		else {
			int[] a= {3,3};
			return a;
		}
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char x;
		 System.out.println("s ou d");
		 Scanner s =new Scanner(System.in);
	        String b=s.nextLine();
	        x=b.charAt(0);
	       int y= (int)(Math.random()+0.5);
	     
	      System.out.print((decise(x,y))[0]);
	}

}
