package exos;
import java.io.*;
import java.util.Scanner;

import java.io.*;
import java.util.Scanner;

public class tp7 {

    static String[][] ajouter(String[][] x, String a, String b) {
        int i = 0;
        
        // Locate the first "fin" entry to find the insertion point
        while (!(x[0][i].equals("fin"))) {
            i++;
        }
        
        x[0][i + 1] = "fin";
        x[1][i + 1] = "fin";
        x[0][i] = a;
        x[1][i] = b;

        return x;
    }

    static String recherche(String[][] x) {
        int i = 0;
        String y;
        
        System.out.print("Entrer le nom: ");
        Scanner s = new Scanner(System.in);
        y = s.nextLine();

        while (!(x[0][i].equals("fin"))) {
            if (x[0][i].equals(y)) {
                return x[1][i];
            }
            i++;
        }
        return "Nom introuvable.";
    }

    static void lister(String[][] x) {    
        int i = 0;
        
        while (!(x[0][i].equals("fin"))) {
            System.out.println(x[0][i] + " " + x[1][i]);
            i++;
        }
    }

    static void sauvegarder(String[][] x) throws IOException {
        try (BufferedWriter fw = new BufferedWriter(new FileWriter("Iknow.txt"))) {
            for (int i = 0; !x[0][i].equals("fin"); i++) {
                fw.write(x[0][i] + ";" + x[1][i]);
                fw.newLine();
            }
        }
    }

    static void importer(String[][] x) throws IOException {
        try (BufferedReader f = new BufferedReader(new FileReader("Iknow.txt"))) {
            String c = f.readLine();
            
            while (c != null) {
                x = ajouter(x, c.substring(0, c.indexOf(";")), c.substring(c.indexOf(";") + 1));
                c = f.readLine();
            }
        }
    }

    public static void main(String[] args) throws IOException {
        String y;
        String[][] x = new String[100][2];
        x[0][0] = "fin";
        x[1][0] = "fin";
        
        // Check if the file exists before importing
        File f = new File("Iknow.txt");
        if (f.exists()) {
            importer(x);
        }

        Scanner s = new Scanner(System.in);
        do {
            System.out.print("(a)jouter (r)echerche (l)ister (q)uitter : ");
            y = s.nextLine();

            switch (y) {
                case "a":
                    System.out.print("Entrer le nom: ");
                    String a = s.nextLine();
                    System.out.print("Entrer le numero: ");
                    String b = s.nextLine();
                    ajouter(x, a, b);
                    break;

                case "r":
                    System.out.println("Numéro trouvé: " + recherche(x));
                    break;

                case "l":
                    lister(x);
                    break;

                case "q":
                    sauvegarder(x);
                    System.out.println("Données sauvegardées. Au revoir!");
                    break;

                default:
                    System.out.println("Option invalide, réessayez.");
                    break;
            }
        } while (!y.equals("q"));

        s.close();
    }
}

