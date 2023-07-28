package pl.kosieradzki.fiszki.boxes;

import pl.kosieradzki.fiszki.Game;
import pl.kosieradzki.fiszki.boxes.Box;

import java.util.ArrayList;

public class MasteredBox extends Box {
    public MasteredBox() {
        super(Game.MASTERED_BOX);
        fiszkas = new ArrayList<>();
    }
}
