package ee.tlu.kodutoo01;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class MingiEntityController {
    List<MingiEntity> numbrid = new ArrayList<>();

    @GetMapping("numbrid")
    public List<MingiEntity> saaNumbrid() {
        return numbrid;
    }

    @PostMapping("numbrid/{nimetus}/{number}/{kaal}")
    public List<MingiEntity> lisaNumber(
            @PathVariable String nimetus,
            @PathVariable int number,
            @PathVariable int kaal
    ) {
        MingiEntity arv = new MingiEntity(nimetus, number, kaal);
        numbrid.add(arv);
        return numbrid;
    }

    @DeleteMapping("numbrid/{index}")
    public List<MingiEntity> kustutaNumber(@PathVariable int index) {
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
        for (MingiEntity entity : numbrid) {
            summa += entity.getNumber();
        }
        return summa;
    }
    @GetMapping("numbrid/keskmine")
    public double keskmineNumbrid() {
        double summa = 0;
        for (MingiEntity entity : numbrid) {
            summa += entity.getNumber();
        }
        return summa / numbrid.size();
    }

    

}
