package exos;
import java.util.Scanner;
public class exo2 {

	public static void main(String[] args) {
        int a,b,x;
        Scanner lecteur =new Scanner(System.in); 
        System.out.print("entrer a\n"); 
        a=lecteur.nextInt();
        System.out.print("entrer b\n"); 
        b=lecteur.nextInt();
        x=a;
        a=b;
        b=x;
        System.out.print(b+"et "+a);

	}

}
