package exos;

import java.util.Scanner;

public class TD3EXO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x;
Scanner s=new Scanner(System.in); 
System.out.println("entrer le nombre");
x=s.nextInt();
//solution avec string
String a;
a=""+x;
if((a.charAt(a.length()-1))==(a.charAt(a.length()-2))
&& (a.charAt(a.length()-1))==(a.charAt(a.length()-3))
		){
	System.out.println("3 dernier sont identique");
}
else if((a.charAt(a.length()-1))!=(a.charAt(a.length()-2))
&& (a.charAt(a.length()-1))!=(a.charAt(a.length()-3))
&& (a.charAt(a.length()-2))!=(a.charAt(a.length()-3))
		){
	System.out.println("3 dernier sont tous differents");
}
else {
	System.out.println("au moins deux sont identique");
}
//solution avec modulo
if( ((x/100)%10)==(x/10)%10 &&((x/100)%10)==(x%10)){
	System.out.println("3 dernier sont identique");
}
else if(((x/100)%10)!=(x/10)%10
&& (x/100)%10!=(x/100)%10
&& (x/10)%10!=(x/100)%10
		){
	System.out.println("3 dernier sont tous differents");
}
else {
	System.out.println("au moins deux sont identique");
}

}}
