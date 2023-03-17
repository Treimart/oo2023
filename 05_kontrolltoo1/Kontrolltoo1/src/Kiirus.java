public class Kiirus {
    double kiirus1;
    double kiirus2;

    public Kiirus (double kiirus1, double kiirus2) {
        this.kiirus1 = kiirus1;
        this.kiirus2 = kiirus2;
    }

    public double leiaKeskmineKiirus() {
        this.kiirus1 = kiirus1;
        this.kiirus2 = kiirus2;
        return (kiirus1 + kiirus2) / 2;
    }
}