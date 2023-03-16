import java.util.List;

public class Kolmnurk {
    List<Double> xCoords;
    List<Double> yCoords;

    public Kolmnurk(List<Double> xCoords, List<Double> yCoords) {
        this.xCoords = xCoords;
        this.yCoords = yCoords;
    }

    public double annaYmberm66t(List<Double> xCoords, List<Double> yCoords){
        this.xCoords = xCoords;
        this.yCoords = yCoords;
        double kylg1 = Math.pow((xCoords.get(1) - xCoords.get(0)), 2) + Math.pow((yCoords.get(1) - yCoords.get(0)), 2);
        double kylg2 = Math.pow((xCoords.get(2) - xCoords.get(1)), 2) + Math.pow((yCoords.get(2) - yCoords.get(1)), 2);
        double kylg3 = Math.pow((xCoords.get(0) - xCoords.get(2)), 2) + Math.pow((yCoords.get(0) - yCoords.get(2)), 2);
        return kylg1 + kylg2 + kylg3;
    }

    public double lisaJaAnnaYmberm66t(double newX, double newY, double ymberm66t) {
        xCoords.add(newX);
        yCoords.add(newY);
        return 5.0; //See tekitab mulle segadust, sest ma ei saa aru, mida ma selle lisatud küljega tegema pean
    }
}
