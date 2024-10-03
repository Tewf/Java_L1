package exos;
import java.util.Scanner;
public class kirikou {
		// Lecture d’un entier entre 1 et 100
		 static double puissance(double a, int b) {
			// calcule a puissance b
			int i=1;
			double res=1;
			while (i<=b) {
			 res=res*a;
			 i++;
			}
			return(res);
			 }
			 public static void main(String[] args) {
			System.out.println(puissance(4,5));
			 }
			}

