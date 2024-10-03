package exos;
import java.util.Arrays;

import java.util.Scanner;

public class solver {
static String redpow(String x) {
for(int i=0;i<x.length();i++) {
	for(int j=i;j<x.length();j++) {
		if(x.charAt(i)==x.charAt(j)) {
			x=x.substring(0,j)+x.substring(j+1);
		}
	}
}
return x;
}

static String sortString(String inputString)
{
    // Converting input string to character array
    char tempArray[] = inputString.toCharArray();

    // Sorting temp array using
    Arrays.sort(tempArray);

    // Returning new sorted string
    return new String(tempArray);
}
static int verify(String x, int i) {
	if(x.indexOf('+',i)!=-1) {
		return x.indexOf('+',i);}
	else{
			return x.length();
		}
	}
 
static String[] wow(String x) {
	String [] y=new String[x.length()];
	int j=1,k=0;
	y[k]=sortString(x.substring(k,verify(x,k+1)));
	for(int i=verify(x,k+1);i<x.length();i=verify(x,i+1)){
		y[j]=sortString(x.substring(i+1,verify(x,i+1)));
		j++;
	}
	return y;
}
static String simplify(String[] x) {
	int j=0,i=0;
	String [] w=x;
	int[] s= new int[x.length];
while(x[i]!=null) {
	j=i;
	while(x[j]!=null) {

		
	}

}


return "";
}

//x+x+xy+yx+y

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x;
		Scanner s=new Scanner(System.in); 
		 System.out.print("le premier jour de l anne \n");
	        x=s.nextLine();
	    String [] y=wow(x);
	    for(int i=0;i<y.length;i++) {
	    	    System.out.println(y[i]); 

	    	}
	   
	
	
	
	
	
	
	
	
}}
