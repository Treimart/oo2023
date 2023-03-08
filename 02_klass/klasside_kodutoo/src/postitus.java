import java.util.Date;
import java.util.List;

public class postitus {
    String kasutajanimi;
    Date postitamiseAeg;
    String tekst;
    List<String> tagid;
    Date muutmiseAeg;
    Date kustutamiseAeg;

    public postitus(String kasutajanimi, String tekst, List<String> tagid) {
        this.kasutajanimi = kasutajanimi;
        this.tekst = tekst;
        this.tagid = tagid;
        this.postitamiseAeg = new Date();
        this.muutmiseAeg = null;
        this.kustutamiseAeg = null;
    }

    public String muudaPostitust(String uusTekst) {
        this.tekst = uusTekst;
        this.muutmiseAeg = new Date();
        return "Postituse sisu on muudetud!";
    }

    public String kustutaPostitus() {
        this.kustutamiseAeg = new Date();
        return "Postitus on kustutatud!";
    }
}
