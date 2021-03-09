package exceptions;

import java.util.Scanner;

public class Somme {

    public static void main(String[] args) {
        int resultat = 0;
        for (int i = 0; i < args.length; i++) {
            try {
                Scanner scan = new Scanner(args[i]);
                resultat += scan.nextInt();
                System.out.println("Résultat de la somme : " + resultat);
            } catch (Exception e) {
                System.err.println("Caractère interdit : position " + i++);
            }
        }
    }
}