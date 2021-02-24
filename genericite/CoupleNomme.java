package genericite;

public class CoupleNomme<T> extends Couple {

    private String nom;

    public CoupleNomme(T premier, T second, String nom) {
        super(premier, second);
        this.nom = nom;
    }

    @Override
    public void affiche() {
        System.out.println("Nom : " + nom + ", Première valeur : " + super.x + ", seconde valeur : " + super.y);
    }
}
