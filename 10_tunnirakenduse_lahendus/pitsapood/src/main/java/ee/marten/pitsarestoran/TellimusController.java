package ee.marten.pitsarestoran;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@RestController
public class TellimusController {

    @Autowired
    LaudController laudController; // ühel ja samal mälukohal
    @Autowired
    PitsaController pitsaController; // otseühendus selle klassiga

    Pitsa tellimus1 = new Pitsa(1, "Margherita", Arrays.asList("tomatikaste", "juust"));
    Pitsa tellimus2 = new Pitsa(2, "Pepperonipitsa", Arrays.asList("tomatikaste", "juust", "pepperoni salaami"));
    Laud tellija1 = new Laud(1, 22, new Date());
    List<Tellimus> tellimused = new ArrayList<>(Arrays.asList(
            new Tellimus(1, tellija1, tellimus1),
            new Tellimus(2, tellija1, tellimus2)
    ));

    // GET    localhost:8080/tellimused
    @GetMapping("tellimused")
    public List<Tellimus> saaTellimused() {
        return tellimused;
    }

    // DELETE localhost:8080/kustuta-tellimus/1
    @DeleteMapping("kustuta-tellimus/{index}")
    public String kustutaTellimus(@PathVariable int index) {
        tellimused.remove(index);
        return "Tellimus kustutatud!";
    }

    // POST localhost:8080/lisa-tellimus?id=7&lauaIndeks=3&tooteIndex=2
    @PostMapping("lisa-tellimus")
    public List<Tellimus> lisaTellimus(
            @RequestParam int id,
            @RequestParam int lauaIndeks,
            @RequestParam int tooteIndex) {
        Laud laud = laudController.isikud.get(lauaIndeks);

        Pitsa tellitudPitsa = pitsaController.tooted.get(tooteIndex);

        tellimused.add(new Tellimus(id, laud, tellitudPitsa));
        return tellimused;
    }
}