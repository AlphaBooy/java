package genericite;

import java.util.Scanner;

public class Nom {
    public static void main(String[] args) {
        String nom;
        System.out.print("Quel est votre nom ? ");
        Scanner myObj = new Scanner(System.in);
        nom = myObj.nextLine();
        PointNomme point = new PointNomme(2.2, 2.2, nom);

        point.affiche();
    }
}
