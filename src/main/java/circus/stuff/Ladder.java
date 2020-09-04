package circus.stuff;

<<<<<<< HEAD:src/main/java/circus/stuff/Ladder.java
import circus.animal.Equipment;

=======
>>>>>>> origin/improved:src/main/java/Ladder.java
public class Ladder extends Equipment {

    public Ladder(int purchasePrice) {
        super(purchasePrice);
    }

    @Override
    public int getValue() {
        return purchasePrice / 2;
    }
}
