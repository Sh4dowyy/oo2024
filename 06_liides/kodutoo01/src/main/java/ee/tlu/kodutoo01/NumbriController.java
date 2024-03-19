package ee.tlu.kodutoo01;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController

public class NumbriController {
    List<Integer> numbrid = new ArrayList<>();

    @GetMapping("numbrid")
    public List<Integer> saaNumbrid() {
        return numbrid;
    }

    @PostMapping("numbrid/{number}")
    public List<Integer> lisaNumber(@PathVariable Integer number) {
        numbrid.add(number);
        return numbrid;
    }

    @DeleteMapping("numbrid/{index}")
    public List<Integer> kustutaNumber(@PathVariable int index) {
        numbrid.remove(index);
        return numbrid;
    }

    @GetMapping("numbrid/mitu")
    public int mituNumbri() {
        return numbrid.size();
    }

    @GetMapping("numbrid/summa")
    public int summaNumbrid() {
        int summa = 0;
        for (int number : numbrid) {
            summa += number;
        }
        return summa;
    }
    @GetMapping("numbrid/keskmine")
    public double keskmineNumbrid() {
        double summa = 0;
        for (double number : numbrid) {
            summa += number;
        }
        double keskmine = summa / numbrid.size();
        return keskmine;
    }
}
