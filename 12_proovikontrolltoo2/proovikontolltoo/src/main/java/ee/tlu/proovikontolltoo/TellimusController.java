package ee.tlu.proovikontolltoo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController@CrossOrigin(origins = "http://localhost:3000")
public class TellimusController {
    @Autowired
    TellimusRepository tellimusRepository;

    @GetMapping("tellimused")
    public List<Tellimus> postKategooria(@RequestBody Tellimus tellimus) {
        return tellimusRepository.findAll();
    }
    @PostMapping("tellimused")
    public List<Tellimus> postTellimus(@RequestBody Tellimus tellimus) {
        tellimusRepository.save(tellimus);
        return tellimusRepository.findAll();
    }
    @DeleteMapping("tellimused/{id}")
    public List<Tellimus> postKategooria(@RequestBody Long id) {
        tellimusRepository.deleteById(id);
        return tellimusRepository.findAll();
    }
}
