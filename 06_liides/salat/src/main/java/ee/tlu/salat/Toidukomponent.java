package ee.tlu.salat;
// mis koosneb toiduainest ja temaga seotud kogusest toidu sees
// Klassikompleky -> Kartul+omadused ja mitu grammi

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
public class Toidukomponent {
    ToiduaineEntity toiduaine;
    int kogus;
}
