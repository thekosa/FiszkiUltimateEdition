package pl.kosieradzki.fiszki;

import pl.kosieradzki.fiszki.boxes.Box;
import pl.kosieradzki.fiszki.boxes.MasteredBox;

import java.util.HashMap;
import java.util.Map;

public class Game {
    public static final int BOX_QUANTITY = 5;
    public static final int MASTERED_BOX = 2137;
    private final Map<Integer, Box> boxes = new HashMap<>();
    private final MasteredBox masteredBox = new MasteredBox();

    public Game() {
        for (int i = 1; i <= BOX_QUANTITY; i++) {
            boxes.put(i, new Box(i));
        }
    }

    public int nextBox(int currBoxNumb, Fiszka fiszka) {
        boxes.get(currBoxNumb).getFiszkas().remove(fiszka);
        if (currBoxNumb == BOX_QUANTITY) {
            masteredBox.getFiszkas().add(fiszka);
            return 0;
        } else {
            boxes.get(currBoxNumb + 1).getFiszkas().add(fiszka);
            return currBoxNumb + 1;
        }
    }
}
