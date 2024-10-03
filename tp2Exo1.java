package exos;
import java.util.Scanner;
public class tp2Exo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y,z,t=0;
		String k;
        Scanner s=new Scanner(System.in); 
        System.out.print("le premier jour de l anne \n");
        k=s.nextLine();
        System.out.print("le mois\n");
        y=s.nextInt();
        System.out.print("le jour\n");
        x=s.nextInt();
        System.out.print("l'anne \n");
        z=s.nextInt();
        if(z%4==0 && y>=3) {x=x+1;};
        switch(y){
        case 1:
          y=0;
          break;
        case 2:
          y=31;
          break;
        case 3:
        	y=59;
        	break;
        case 4:
        	y=90;
        	break;
        case 5:
        	y=120;
        	break;
        case 6:
        	y=151;
        	break;
        case 7:
        	y=181;
        	break;
        case 8:
        	y=212;
        	break;
        case 9:
        	y=243;
        	break;
        case 10:
        	y=273;
        	break;
        case 11:
        	y=304;
        	break;
        case 12:
        	y=334;
        	break;
      };
      switch(k){
      case "dimanche":
    	  t=0;
    	  break;
      case "lundi":
    	  t=1;
    	  break;
      case "mardi":
    	  t=2;
    	  break;
      case "mercredi":
    	  t=3;
    	  break;
      case "jeudi":
    	  t=4;
    	  break;
      case "vendredi":
    	  t=5;
    	  break;
      case "samedi":
    	  t=6;
    	  break;
      
      };
      switch((x+y-1)%7+t){
      case 0:
    	 System.out.println("dimanche");
         break;
      case 1:
         System.out.println("lundi");
         break;
      case 2:
         System.out.println("mardi");
         break;
      case 3:
         System.out.println("mercredi");
         break;
      case 4:
         System.out.println("jeudi");
         break;
      case 5:
         System.out.println("vendredi");
         break;
      case 6:
         System.out.println("samedi");
         break;
      }
	}

}
