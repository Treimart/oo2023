package ee.marten.pitsarestoran;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Tellimus {
    private int id;
    private Laud laud;
    private Pitsa pitsa;
}
