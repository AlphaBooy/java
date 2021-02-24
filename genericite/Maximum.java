package genericite;

public class Maximum<T> {
    static <T extends Comparable<T>> T max (T[] valeurs) {
        int i = 0;
        T max = valeurs[0];
        while (i++ < valeurs.length) {
            max = valeurs[i].compareTo(max) < 0 ? max : valeurs[i];
        }
        return max;
    }
}