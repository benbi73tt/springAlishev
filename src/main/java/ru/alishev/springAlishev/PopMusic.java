package ru.alishev.springAlishev;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PopMusic implements Music {
    private List<String> popMus;
    public PopMusic() {
        popMus = new ArrayList<>();
        popMus.add("mus1Pop");
        popMus.add("mus2Pop");
        popMus.add("mus3Pop");
    }



    @Override
    public List<String> getSong() {
        return popMus;
    }
}

