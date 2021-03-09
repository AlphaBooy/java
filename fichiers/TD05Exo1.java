package fichiers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TD05Exo1 {

    public static void lectureFichierCaractere(Path ficTxt) throws IOException {
        /* Teste si le fichier demandé par l'utilisateur existe ou non */
        if (!Files.exists(ficTxt)) {
            System.err.println("Le fichier spécifié \"" + ficTxt.toString()
                              + "\" est introuvable. Veuillez réessayer avec un fichier existant");
            return;
        }
        /* Teste si le répertoire demandé par l'utilisateur existe ou non */
        if (!Files.isDirectory(ficTxt.getParent())) {
            System.err.println("Le répertoire spécifié \"" + ficTxt.toString()
                    + "\" est introuvable. Veuillez réessayer avec un répertoire existant");
            return;
        }
        System.out.println("Informations relatives au fichier :");

        System.out.println("Le fichier s'appelle : \"" + ficTxt.getFileName() + "\" !");
        System.out.println("Le chemin d'accès du fichier : \"" + ficTxt.getParent() + "\" !");
        System.out.println("La taille du fichier : \"" + Files.size(ficTxt) + "\" !");

        System.out.println("\nInformations relatives au contenu :");

        try (BufferedReader br = new BufferedReader(new FileReader(ficTxt.toString()))) {
            int nbChar = 0, nbDigit = 0, nbWhiteSpace = 0, nbAlphabetic = 0, c;
            do {
                c = br.read();
                nbChar++;
                nbDigit += Character.isDigit(c) ? 1 : 0;
                nbAlphabetic += Character.isAlphabetic(c) ? 1 : 0;
                nbWhiteSpace += Character.isWhitespace(c) ? 1 : 0;
            } while (c != -1);
            System.out.println("Nombre total de caractères : \"" + nbChar + "\" !");
            System.out.println("Nombre total de caractères numériques : \"" + nbDigit + "\" !");
            System.out.println("Nombre total de caractères alphabétiques : \"" + nbAlphabetic + "\" !");
            System.out.println("Nombre total de caractères séparateurs : \"" + nbWhiteSpace + "\" !");
            System.out.println("Pourcentage de caractères numériques : \"" + (nbDigit / nbChar) * 100 + "%\" !");
        }
    }

    public static void main(String[] args) throws IOException {
        lectureFichierCaractere(Path.of("C:\\test.txt"));
    }
}
