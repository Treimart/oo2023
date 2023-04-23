package ee.marten.pitsarestoran;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class PitsaController {
    List<Pitsa> tooted = new ArrayList<>(Arrays.asList(
            new Pitsa(1, "Margherita", Arrays.asList("tomatikaste", "juust")),
            new Pitsa(2, "Pepperonipitsa", Arrays.asList("tomatikaste", "juust", "pepperoni salaami")),
            new Pitsa(3, "Roma", Arrays.asList("tomatikaste", "juust", "sibul", "peekon", "marineeritud kurk")),
            new Pitsa(4, "Venezia", Arrays.asList("tomatikaste", "juust", "salaami", "jalapeno", "küüslauk")),
            new Pitsa(5, "Trühvel", Arrays.asList("juust", "valge trühvlikaste", "kukeseened", "toorjuust"))
    ));

    // GET  localhost:8080/pitsad
    @GetMapping("pitsad")
    public List<Pitsa> saaTooted() {
        return tooted;
    }

    // DELETE localhost:8080/kustuta-pitsa/1
    @DeleteMapping("kustuta-pitsa/{index}")
    public String kustutaToode(@PathVariable int index) {
        tooted.remove(index);
        return "Toode kustutatud!";
    }

    // POST localhost:8080/lisa-pitsa?id=8&nimi=Bambina&koostisosad=tomatikaste,juust,sink
    @PostMapping("lisa-pitsa")
    public List<Pitsa> lisaToode(
            @RequestParam int id,
            @RequestParam String nimi,
            @RequestParam List<String> koostisosad) {
        tooted.add(new Pitsa(id, nimi, koostisosad));
        return tooted;
    }
}