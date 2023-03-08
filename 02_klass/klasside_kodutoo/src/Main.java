import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        postitus teema1 = new postitus("Jakobson", "Tänane ilm on mind väga üle kurnanud. Ma ei mõtlegi täna välja minna!", Arrays.asList("#ilm", "#produktiivsus", "#enesetunne"));
        postitus teema2 = new postitus("Maasikas", "Liigun siin praegu sõpradega Pariisis ringi. Blogid on juba üleval", Arrays.asList("#reisimine", "#pariis", "#reklaam"));
        postitus teema3 = new postitus("Trumphius666", "Täna ehitame me kõige suurema seina, mida keegi kunagi näinud on.", Arrays.asList("#poliitika", "#sein"));

        String tegevus1 = teema1.muudaPostitust("Täna on väga meeldiv ilm. Sain isegi jooksmas käidud.");
        System.out.println(tegevus1);

        String tegevus2 = teema3.kustutaPostitus();
        System.out.println(tegevus2);

        System.out.println(teema1.kasutajanimi+" "+teema1.tagid+"\n"+ teema1.tekst);
    }
}