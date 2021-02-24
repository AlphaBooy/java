package collections;

import java.util.ArrayList;

public class Cercle {
    double rayon;
    private int x, y;

    public Cercle(int x, int y, double rayon) {
        this.x = x;
        this.y = y;
        this.rayon = rayon;
    }

    public static void main(String[] args) {
        Cercle c = new Cercle(5, 7, 8);
        Cercle c2 = new Cercle(9, 23, 7);
        Cercle c3 = new Cercle(2, 4, 5);

        ArrayList<Cercle> tab2cercle = new ArrayList<Cercle>();
        tab2cercle.add(c);
        tab2cercle.add(c2);
        tab2cercle.add(c3);

        tab2cercle = c.trier(tab2cercle);

        for (int i = 0; i < tab2cercle.size(); i++) {
            tab2cercle.get(i).affiche();
        }

        tab2cercle = c.trier2(tab2cercle);

        for (int i = 0; i < tab2cercle.size(); i++) {
            tab2cercle.get(i).affiche();
        }
    }

    public void affiche() {
        System.out.println("Coordonnées : " + x + ", " + y + " rayon : " + rayon);
    }

    public double getRayon() {
        return rayon;
    }

    public int getX() {
        return x;
    }

    public ArrayList<Cercle> trier(ArrayList<Cercle> c) {
        for (int i = 0; i < c.size(); i++) {
            for (int a = 1; a < c.size(); a++) {
                if (c.get(a - 1).getRayon() > c.get(a).getRayon()) {
                    Cercle verre = c.get(a - 1);
                    c.set(a - 1, c.get(a));
                    c.set(a, verre);

                }
            }
        }
        return c;
    }

    public ArrayList<Cercle> trier2(ArrayList<Cercle> c) {
        for (int i = 0; i < c.size(); i++) {
            for (int a = 1; a < c.size(); a++) {
                if (c.get(a - 1).getX() > c.get(a).getX()) {
                    Cercle verre = c.get(a - 1);
                    c.set(a - 1, c.get(a));
                    c.set(a, verre);

                }
            }
        }
        return c;
    }
}
