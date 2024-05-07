package ee.tlu.kontrolltoo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AutoRepository extends JpaRepository<Auto, Long> {
    //List<Auto> findAllBy
    List<Auto> findByAastaa(int aastaa);
    List<Auto> findByPikkusBetween(double min, double max);
    Auto findFirstByMassNotNullOrderByMassDesc();
}
