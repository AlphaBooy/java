package genericite;

public abstract class ListeAbstraite<T> {
    /**
     * Ajoute l'élément "element" à la fin de la liste
     *
     * @param element Element à ajouter à la fin de la liste
     */
    abstract void ajouter(T element);

    /**
     * Ajoute l'élément "element" à l'indice donnée de la liste
     *
     * @param element  Element à ajouter à la fin de la liste
     * @param position Indice auquel ajouter l'élément
     */
    abstract void ajouter(T element, int position);

    /**
     * Vide la liste
     */
    abstract void vider();

    /**
     * Assure que la liste peut posséder taille élément
     *
     * @param taille Nombre d'élément dont on veut s'assurer la capcité dans la liste
     */
    abstract boolean fixerCapacite(int taille);

    /**
     * @return le nombre d'élement de la liste
     */
    abstract int taille();

    /**
     * Renvoie l'élément à l'indixe "index" (s'il existe)
     *
     * @param index Index auquel chercher l'élément
     * @return L'élément à l'index recherché
     */
    abstract T obtenir(int index);

    /**
     * Range l'élément affecte l'élément "index" de la liste a la valeur "élément"
     *
     * @param element valeur de l'élément
     * @param index   index de l'élément
     */
    abstract void ranger(T element, int index);

    /**
     * Enlève l'élément situé à la position "index" de la liste
     *
     * @param index Index de l'élément à retirer de la liste
     */
    abstract void enlever(int index);
}
