package exos;

import java.util.Scanner;

public class Tp3Exo1 {
	public static void main(String[] args) {
		int a,i=1;
		System.out.print("enter your number\n");
        Scanner s =new Scanner(System.in);
        a=s.nextInt();
        while(a!=1){
    		System.out.println(a);

        	if(a%2==0){
        		a=a/2;
        	}
        	else{a=3*a+1;}
        	i++;}
		System.out.print(1);

	}
	}
