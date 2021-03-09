package prog_defensive;

public class Compte {
    private double solde;

    public double getSolde() {
        return solde;
    }
    public double crediter(double montant) {
        assert montant > 0;
        solde += montant;
        return solde;
    }

    public double debiter(double montant) {
        assert montant > 0;
        assert solde > 0; // Pas de découvert
        solde -= montant;
        return solde;
    }
}
