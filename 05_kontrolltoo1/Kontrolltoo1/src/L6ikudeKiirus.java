import java.util.List;

public class L6ikudeKiirus {
    List<Double> l6ikudeKiirused;

    public L6ikudeKiirus(List<Double> l6ikudeKiirused) {
        this.l6ikudeKiirused = l6ikudeKiirused;
    }

    public double l6ikudeKiirused(List<Double> l6ikudeKiirused) {
        this.l6ikudeKiirused = l6ikudeKiirused;
        double sum = 0;
        for(int i = 0; i < l6ikudeKiirused.size(); i++)
            sum += l6ikudeKiirused.get(i);
        double kesk = sum / l6ikudeKiirused.size();
        return kesk;
    }
}
