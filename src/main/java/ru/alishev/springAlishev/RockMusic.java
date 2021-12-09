package ru.alishev.springAlishev;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {
    private List<String> rockMus;
    public RockMusic() {
        rockMus = new ArrayList<>();
        rockMus.add("mus1Rock");
        rockMus.add("mus2Rock");
        rockMus.add("mus3Rock");
    }



    @Override
    public List<String> getSong() {
        return rockMus;
    }
}
