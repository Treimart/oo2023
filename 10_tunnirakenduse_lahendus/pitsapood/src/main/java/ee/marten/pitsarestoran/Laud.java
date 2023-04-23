package ee.marten.pitsarestoran;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Laud {
    private int id;
    private int lauaNr;
    private Date kohaleTulekuAeg;
}
