import java.util.ArrayList;
import java.util.List;

/*
This is called a DAO - data access object
 */

public class PaintingRepository {
    List<Painting> paintings;
    public PaintingRepository() {
        paintings = new ArrayList<>();
    }
    public void addPainting(String title, int year, String artist) {
        Painting p = new Painting(title, year, artist);
        paintings.add(p);
    }

    public List<Painting> getPaintings() {
        return paintings;
    }
}
