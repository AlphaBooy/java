package genericite;

public class Couple<T> {
    public T x, y;

    public Couple(T premier, T second) {
        this.x = premier;
        this.y = second;
    }

    public void affiche() {
        System.out.println("Première valeur : " + x + ", seconde valeur : " + y);
    }
}
