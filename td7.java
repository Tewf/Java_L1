package exos;

public class td7 {
	static int max(int[][]y) {
		int a=y[0][0];
		for(int i=0;i<y.length;i++) {
			for(int j=0;j<y[i].length;j++) {
				if(y[i][j]>a) {
					a=y[i][j];
				}
			}
		}
		return a;
	}
static boolean diagIdentiques(int[][]x) {
	for(int i=0;i<x.length-1;i++) {
		if(x[i][i]!=x[i+1][i+1]) {
			return false;
		}
	}
	return true;
}
static void affiche(boolean[][]x) {
	for(int i=0;i<x.length;i++) {
		for(int j=0;j<x[i].length;j++) {
			if(x[i][j]) {
				System.out.print("O");
			}
			else {
				System.out.print(".");
			}
		} 
		System.out.println("");}
}
static int nbdoubles(boolean[][]x) {
	int y=0;
	for(int i=0;i<x.length;i++) {
		for(int j=0;j<x[i].length-1;j++) {
			if(x[i][j]==true && x[i][j+1]==true ) {
				y++;
			}
		}
	}
	return y;}
static int[]exo3(boolean[][]x){
	int[] y=new int[x.length];
	for(int i=0;i<x.length;i++) {
		int a=0;
		for(int j=0;j<x[i].length;j++) {
			if(x[i][j]==false) {
				y[j-a]=y[j-a]+1;
				a=j;
			}
		}
}
	return y;}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
	}}
