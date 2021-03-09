package exceptions;

import java.util.Scanner;

public class NombreSaisie {
    public static void main(String[] args) {
        int input = 0;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("Veuillez renseigner un nombre entier : ");
            try {
                input = scan.nextInt();
                scan.nextLine();
            } catch (Exception e) {
                System.err.print(scan.next() + " n'est pas un nombre valide, réessayez : ");
            }
        } while(!scan.hasNext() && !scan.hasNextInt());
        System.out.println("Vous avez rentrer un nombre valide : " + input);
    }
}