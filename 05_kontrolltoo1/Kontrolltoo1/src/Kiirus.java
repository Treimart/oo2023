import java.util.List;

public class Kiirus {
    List<Double> kiirused;

    public Kiirus(List<Double> kiirused) {
        this.kiirused = kiirused;
    }

    public double keskmineKiirus(List<Double> kiirused) {
        this.kiirused = kiirused;
        double sum = 0;
        double kesk = 0;
        for(int i = 0; i < kiirused.size(); i++)
            sum += kiirused.get(i);
        kesk = sum / kiirused.size();
        return kesk;
    }
}