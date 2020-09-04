<<<<<<< HEAD:src/main/java/circus/animal/Equipment.java
package circus.animal;
=======
package circus.stuff;
>>>>>>> origin/improved:src/main/java/circus/stuff/Equipment.java

import circus.Asset;

public abstract class Equipment implements Asset {
    protected int purchasePrice;

    public Equipment(int purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public int getValue() {
        return purchasePrice;
    }
}
