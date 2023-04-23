package ee.marten.pitsarestoran;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@RestController
public class LaudController {
    List<Laud> isikud = new ArrayList<>(Arrays.asList(
            new Laud(1, 22 ,new Date()),
            new Laud(2, 12 ,new Date()),
            new Laud(3, 6 ,new Date()),
            new Laud(4, 31 ,new Date()),
            new Laud(5, 17 ,new Date())
    ));

    // GET  localhost:8080/kohad
    @GetMapping("kohad")
    public List<Laud> saaKohad() {
        return isikud;
    }

    // DELETE localhost:8080/eemalda-koht/1
    @DeleteMapping("eemalda-koht/{index}")
    public String kustutaKoht(@PathVariable int index) {
        isikud.remove(index);
        return "Isik kustutatud!";
    }

    // POST localhost:8080/lisa-koht?id=6&lauaNr=46
    @PostMapping("lisa-koht")
    public List<Laud> lisaKoht(
            @RequestParam int id,
            @RequestParam int lauaNr) {
        isikud.add(new Laud(id, lauaNr, new Date()));
        return isikud;
    }
}