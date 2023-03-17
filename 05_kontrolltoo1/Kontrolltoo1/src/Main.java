import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        Kiirus kiirus1 = new Kiirus(4.0, 7.0);

        double vastus = kiirus1.leiaKeskmineKiirus();
        System.out.println("Kahe kilomeetripikkuse lõigu läbimise tee keskmine kiirus on "+vastus+" km/h");

        // IGNOREERIDA SEDA, SEE ON VANA KOOD
//        List<Double> kiirused = new ArrayList<>(Arrays.asList(12.0, 24.0));
//        Kiirus kiirus1 = new Kiirus(kiirused);
//        double keskmine = kiirus1.keskmineKiirus(kiirused);
//        System.out.println("Kahe kilomeetri läbimise keskmine kiirus on "+keskmine+" km/h.");

        List<Double> keskmised = new ArrayList<>(Arrays.asList(3.0, 4.0, 5.0, 8.0, 10.0));
        L6ikudeKiirus kiirus2 = new L6ikudeKiirus(keskmised);
        double keskmine1 = kiirus2.l6ikudeKiirused(keskmised);
        System.out.println("Kogu selle tee läbimise keskmine kiirus on "+keskmine1+" km/h.");

        BufferedReader br = new BufferedReader(new FileReader("kiirused.txt"));
        String rida = br.readLine();
        double koguKiirus = 0.0;
        int kiiruseid = 0;
        while (rida != null) {
            double v22rtus = Double.parseDouble(rida);
            //System.out.println(v22rtus);
            koguKiirus += v22rtus;
            kiiruseid += 1;
            rida = br.readLine();
        }
        PrintWriter pw = new PrintWriter(new FileWriter("keskmine.txt"));
        pw.print(koguKiirus / kiiruseid);
        pw.close();
    }
}