package ee.tlu.kontrolltoo;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
public class RestTemplateController {
    @GetMapping("cars")
    public List<Car> carName() {

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Car[]> response = restTemplate.exchange("https://public.opendatasoft.com/api/explore/v2.1/catalog/datasets/all-vehicles-model/records?limit=100", HttpMethod.GET, null, Car[].class);

        return Arrays.asList(response.getBody());


    }
}
