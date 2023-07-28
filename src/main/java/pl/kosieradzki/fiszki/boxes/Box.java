package pl.kosieradzki.fiszki.boxes;

import lombok.Data;
import pl.kosieradzki.fiszki.Fiszka;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public @Data class Box {
    private final int number;
    protected List<Fiszka> fiszkas;

    public Box(int number) {
        this.number = number;
        fiszkas = new ArrayList<>();
    }

    public void randomize(){
        Collections.shuffle(fiszkas);
    }
}
