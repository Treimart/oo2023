import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Double> kiirused = new ArrayList<>(Arrays.asList(10.0, 15.0, 20.0));
        Kiirus kiirus1 = new Kiirus(kiirused);

        double keskmine = kiirus1.keskmineKiirus(kiirused);
        System.out.println(keskmine);
    }
}