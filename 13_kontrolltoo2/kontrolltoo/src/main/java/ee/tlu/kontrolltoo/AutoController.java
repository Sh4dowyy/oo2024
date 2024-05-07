package ee.tlu.kontrolltoo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class AutoController {
    @Autowired
    AutoRepository autoRepository;

    @GetMapping("autod")
    public List<Auto> getAutod() {
        return autoRepository.findAll();
    }
    @PostMapping("autod")
    public List<Auto> postAuto(@RequestBody Auto auto) {
        autoRepository.save(auto);
        return autoRepository.findAll();
    }
    @DeleteMapping("autod/{id}")
    public List<Auto> deleteAuto(@PathVariable Long id) {
        autoRepository.deleteById(id);
        return autoRepository.findAll();
    }

    @GetMapping("auto-by-year/{aastaa}")
    public List<Auto> getAutodByYear(@PathVariable int aastaa) {
        return autoRepository.findByAastaa(aastaa);
    }

    @GetMapping("auto-pikkus-vahemik/{min}/{max}")
    public List<Auto> autodePikkusVahemik(@PathVariable double min, @PathVariable double max) {
        return autoRepository.findByPikkusBetween(min, max);
    }
    @GetMapping("max-massiga-auto")
    public Auto maxMassigaAuto() {
        return autoRepository.findFirstByMassNotNullOrderByMassDesc();
    }
}
