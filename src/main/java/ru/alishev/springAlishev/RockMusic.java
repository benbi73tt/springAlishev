package ru.alishev.springAlishev;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {
    private List<String> rockMus;

    @PostConstruct
    public void doMyInit(){//запускается при запуске
        System.out.println("do you my initialization");
    }
    @PreDestroy
    public void doMyDestroy(){//запускается при выключении, перед context
        System.out.println("do you my destroy");
    }
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
