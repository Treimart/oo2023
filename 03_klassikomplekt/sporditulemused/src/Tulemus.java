public class Tulemus {
    Sportlane sportlane;
    double odavise;
    double kettaheide;
    double kaugushype;

    public Tulemus(Sportlane sportlane, double odavise, double kettaheide, double kaugushype) {
        this.sportlane = sportlane;
        this.odavise = odavise;
        this.kettaheide = kettaheide;
        this.kaugushype = kaugushype;
    }

    public double panePunktidesse() {
        this.odavise = this.odavise * 10;
        this.kettaheide = this.kettaheide * 11;
        this.kaugushype = this.kaugushype * 1;
        return this.odavise + this.kettaheide + this.kaugushype;
    }
}
