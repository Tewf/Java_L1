package exos;
import java.util.Scanner;
public class exo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a,b,c,d; 
        Scanner lecteur =new Scanner(System.in); 
        System.out.print("Combien de secondes?\n"); 
        a=lecteur.nextInt();
        b=a/(24*3600);
        a=a-b*24*3600;
        c=a/3600;
        a=a-c*3600;
        d=a/60;
        a=a-d*60;
        System.out.print(b+"jours "+c+"heurs "+d+"minutes "+"et "+a+"secondes");

	}

}
