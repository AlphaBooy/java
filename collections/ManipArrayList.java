package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ManipArrayList {

    public static void affOrdreNat(ArrayList<Integer> tab) {
        Collections.sort(tab);
        System.out.print("[");
        for(int i = 0; i < tab.size(); i++) {
            System.out.print(tab.get(i) + ", ");
        }
        System.out.println("]");
    }

    public static void affOrdreNat2(ArrayList<Integer> tab) {
        Collections.sort(tab);
        System.out.println(tab.toString());
    }

    public static void affOrdreNat3(ArrayList<Integer> tab) {
        Collections.sort(tab);
        tab.toArray();
        System.out.print("[");
        for (int value:tab) {
            System.out.print(value + ", ");
        }
        System.out.println("]");
    }

    public static void affOrdreNat4(ArrayList<Integer> tab) {
        System.out.print("[");
        Collections.sort(tab);
        Iterator<Integer> it = tab.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + ", ");
        }
        System.out.println("]");
    }

    public static void affOrdreInv(ArrayList<Integer> tab) {
        System.out.print("[");
        Collections.sort(tab);
        Collections.reverse(tab);
        Iterator<Integer> it = tab.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + ", ");
        }
        System.out.println("]");
    }

    public static void affOrdreInv2(ArrayList<Integer> tab) {
        System.out.print("[");
        Collections.sort(tab);
        for (int i = tab.size() - 1; i >= 0; i--) {
            System.out.print(tab.get(i) + ", ");
        }
        System.out.println("]");
    }

    public static void affPair(ArrayList<Integer> tab) {
        System.out.print("[");
        for (int i = 0; i < tab.size(); i++) {
            if (i % 2 == 0) {
                System.out.print(tab.get(i) + ", ");
            }
        }
        System.out.println("]");
    }

    public static void affPair2(ArrayList<Integer> tab) {
        System.out.print("[");
        int i = 0;
        while (i < tab.size()) {
            System.out.print(tab.get(i) + ", ");
            i += 2;
        }
        System.out.println("]");
    }

    public static void affSansNeg(ArrayList<Integer> tab) {
        System.out.print("[");
        for (int i = 0; i < tab.size(); i++) {
            if (i > 0) {
                System.out.print(tab.get(i) + ", ");
            } else {
                System.out.print(0 + ", ");
            }
        }
        System.out.println("]");
    }

    public static void affSansNeg2(ArrayList<Integer> tab) {
        System.out.print("[");
        Iterator<Integer> it = tab.iterator();
        while (it.hasNext()) {
            if (it.next() > 0) {
                System.out.print(it.next() + ", ");
            } else {
                System.out.print(0 + ", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        ArrayList<Integer> tab = new ArrayList<>();
        tab.add(100);
        tab.add(-1);
        tab.add(-100);
        tab.add(1);
        tab.add(0);

        affOrdreNat(tab);
        affOrdreNat2(tab);
        affOrdreNat3(tab);
        affOrdreNat4(tab);

        affOrdreInv(tab);
        affOrdreInv2(tab);

        affPair(tab);
        affPair2(tab);

        affSansNeg(tab);
        affSansNeg2(tab);
    }
}
