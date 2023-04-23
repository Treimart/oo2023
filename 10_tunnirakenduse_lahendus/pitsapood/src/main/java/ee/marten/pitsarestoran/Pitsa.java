package ee.marten.pitsarestoran;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Pitsa {
    private int id;
    private String nimi;
    private List<String> koostisosad;
}
