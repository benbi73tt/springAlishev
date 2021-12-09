package ru.alishev.springAlishev;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.ArrayList;
import java.util.List;

public class GenreMusicList {
    private Music genre1;
    private Music genre2;

    public GenreMusicList() {
    }

    @Autowired
    public void setGenreMusicList(@Qualifier("rockMusic") Music music1, @Qualifier("classicalMusic") Music music2) {
        this.genre1 = music1;
        this.genre2 = music1;
    }

    @Autowired
    public List<Music> getGenre(){
        List<Music> list = new ArrayList<>();
        list.add(genre1);
        list.add(genre2);
        return list;
    }
}


