package exos;
import java.util.Scanner;
public class exo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a; 
        Scanner s=new Scanner(System.in); 
        System.out.print("l'heure de la premiere date\n");
        a=s.nextInt();
        System.out.print("les minutes de la premiere date\n");
        a=a*60+s.nextInt();
        System.out.print("les secondes de la premiere date\n");
        a=a*60+s.nextInt();
        System.out.print("l'heure de la deuxieme date\n");
        a=a-(s.nextInt())*3600;
        System.out.print("les minutes de la deuxieme date\n");
        a=a-s.nextInt()*60;
        System.out.print("les secondes de la deuxieme date\n");
        a=a-s.nextInt();
        System.out.print("il y'a "+Math.abs(a));
	}

}
