package genericite;

import java.util.ArrayList;

public class Liste<T> {

    private ArrayList<T> liste;

    public Liste() {
        this.liste = new ArrayList<T>();
    }

    public void ajouter(T element) {
        liste.add(element);
    }

    public void ajouter(T element, int position) {
        if (position < liste.size()) {
            // La position est cohérente
            liste.add(position, element);
        }
        // {Else} on ne fait rien
    }

    public void vider() {
        liste.clear();
    }

    public boolean fixerCapacite(int taille) {
        return liste.size() >= taille ? true : false;
    }

    public int taille() {
        return liste.size();
    }

    public T obtenir(int index) {
        return index < liste.size() ? liste.get(index) : null;
    }

    public void ranger(T element, int index) {
        if (index < liste.size()) {
            liste.set(index, element);
        }
    }

    public void enlever(int index) {
        if (index < liste.size()) {
            liste.remove(index);
        }
    }
}