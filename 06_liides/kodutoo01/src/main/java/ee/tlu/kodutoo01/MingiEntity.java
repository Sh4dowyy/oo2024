package ee.tlu.kodutoo01;

import lombok.Getter;

@Getter
public class MingiEntity {
    String nimetus;
    int number;
    int kaal;

    public MingiEntity(String nimetus, int number, int kaal) {
        this.nimetus = nimetus;
        this.number = number;
        this.kaal = kaal;
    }
}
