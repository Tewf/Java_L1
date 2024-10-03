package exos;

public class Tp3Exo2 {
	public static void main(String[] args) {
		int j = 1, i, k, s;
		while (j <= 50) {
			i = 1;
			k = j;
			s = k;
			while (k != 1) {
				if (k % 2 == 0) {
					k = k / 2;
				} else {
					k = 3 * k + 1;
				}
				if (s < k) {
					s = k;
				}
				i++;
			}
			System.out.println(j + ":" + i + "l'altitude maximal " + s);
			j++;
		}

	}
}
