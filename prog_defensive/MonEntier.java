package prog_defensive;

public class MonEntier {
    private int valeur;

    public int division(MonEntier diviseur) {
        int resultat;
        assert diviseur.valeur != 0;
        assert this.valeur % diviseur.valeur != 1;
        resultat = this.valeur / diviseur.valeur;
        return resultat;
    }
}
