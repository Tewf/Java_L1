package exos;

import java.io.*;
import java.util.Scanner;

public class tp9 {
	static char[] creeAssociations(String t) throws IOException {
		BufferedReader f = new BufferedReader(new FileReader(t));
		String chaineLue = f.readLine();
		char[] x = new char[256];
		while (chaineLue != null) {
			x[chaineLue.charAt(2)] = chaineLue.charAt(0);
			chaineLue = f.readLine();
		}
		f.close();
		return x;
	}

	static char decod(char x, char[] t) {
		return t[x];
	}

	static String decodligne(String x, char[] t) {
		String y = "";
		for (int i = 0; i < x.length(); i++) {
			y = y + decod(x.charAt(i), t);
		}
		return y;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader f = new BufferedReader(new FileReader("texteCode.txt"));
		String chaineLue = f.readLine();
		char[] x = creeAssociations("associations.txt");
		while (chaineLue != null) {
			System.out.println(decodligne(chaineLue, x));
			chaineLue = f.readLine();
		}
		f.close();
	}

}
