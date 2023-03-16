import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Double> xCoords = new ArrayList<>(Arrays.asList(1.0, 2.5, 3.5));
        List<Double> yCoords = new ArrayList<>(Arrays.asList(2.0, 3.5, 4.5));
        Kolmnurk kolmnurk = new Kolmnurk(xCoords, yCoords);

        double ymberm66t = kolmnurk.annaYmberm66t(xCoords, yCoords);
        System.out.println("Kolmnurga ümbermõõt on " + ymberm66t);

        double lisaX = 3;
        double lisaY = 5;
        double hulkm66t = kolmnurk.lisaJaAnnaYmberm66t(lisaX, lisaY, ymberm66t);
        System.out.println(hulkm66t);

        //System.out.println(kolmnurk.xCoords);
        //System.out.println(kolmnurk.yCoords);
    }
}