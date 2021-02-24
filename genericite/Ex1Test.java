package genericite;

public class Ex1Test {
    public static void main(String[] args) {
        double x = 3;
        double y = 6;
        PointNomme A = new PointNomme(x,y,"A");

        A.affiche();

        CoupleNomme B = new CoupleNomme("Test1", "Test2", "TestNom");

        B.affiche();
    }
}
