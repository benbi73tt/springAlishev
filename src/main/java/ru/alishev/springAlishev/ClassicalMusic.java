package ru.alishev.springAlishev;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {
    private List<String>classicMus;
    public ClassicalMusic() {
        classicMus = new ArrayList<>();
        classicMus.add("mus1Clas");
        classicMus.add("mus2Clas");
        classicMus.add("mus3Clas");
    }



    @Override
    public List<String> getSong() {
        return classicMus;
    }
}
