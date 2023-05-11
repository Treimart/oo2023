package ee.treier.proovikontrolltoo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ToitController {

    @Autowired
    ToitRepository toitRepository;

    // localhost:8080/toidu-valgud?nimetus=voileib
    @GetMapping("toidu-valgud")
    public int toiduValgud(
            @RequestParam String nimetus
    ) {
        Toit toit = toitRepository.findById(nimetus).get();
        List<Toidukomponent> toidukomponendid = toit.getToidukomponendid();
        int valk = 0;
        for (Toidukomponent t: toidukomponendid) {
//            valk = valk + t.getToiduaine().getValk() * t.getKogus() / 100;
            valk += t.getToiduaine().getValk() * t.getKogus() / 100;
        }
        return valk;
    }

    // localhost:8080/toidu-rasvad?nimetus=voileib
    @GetMapping("toidu-rasvad")
    public int toiduRasvad(
            @RequestParam String nimetus
    ) {
        Toit toit = toitRepository.findById(nimetus).get();
        List<Toidukomponent> toidukomponendid = toit.getToidukomponendid();
        int rasv = 0;
        for (Toidukomponent t: toidukomponendid) {
//            rasv = rasv + t.getToiduaine().getrasv() * t.getKogus() / 100;
            rasv += t.getToiduaine().getRasv() * t.getKogus() / 100;
        }
        return rasv;
    }

    // localhost:8080/toidu-sysivesikud?nimetus=voileib
    @GetMapping("toidu-sysivesikud")
    public int toiduSysivesikud(
            @RequestParam String nimetus
    ) {
        Toit toit = toitRepository.findById(nimetus).get();
        List<Toidukomponent> toidukomponendid = toit.getToidukomponendid();
        int sysivesik = 0;
        for (Toidukomponent t: toidukomponendid) {
//            sysivesik = sysivesik + t.getToiduaine().getrasv() * t.getKogus() / 100;
            sysivesik += t.getToiduaine().getSysivesik() * t.getKogus() / 100;
        }
        return sysivesik;
    }

    @GetMapping("saa-toiduained")
    public List<Toiduaine> saaToiduAined(
            @RequestParam String nimetus
    ) {
        Toit toit = toitRepository.findById(nimetus).get();
        List<Toidukomponent> toidukomponendid = toit.getToidukomponendid();
        int kogus = 0;
        for (Toidukomponent t: toidukomponendid) {
            kogus += t.getKogus();
        }
        return new ArrayList<>();
    }
    // Allolev kood ei tööta täielikult, aga ma loodan vähemalt, et idee on õige.

    /*@GetMapping("lisa-toidukomponent")
    public List<Toit> lisaToit(
            @RequestParam Long id,
            @RequestParam String nimetus,
            @RequestParam Long toidukomponendid
    ) {
        Toidukomponent toidukomponent = toidukomponentRepository.findById(toidukomponendid).get();
        toitRepository.save(new Toit(id, nimetus, toidukomponentid));
        return toitRepository.findAll();
    }

    // Ülesande kirjeldus tekitas siin segadust
    @GetMapping("toiduainete-kogused")
    public List<Toiduaine> toiduaineteKogused(
            @RequestParam int toitId,
            @RequestParam int kogus
    ) {
        Toit toit = ToitRepository.findById()
    }*/
}