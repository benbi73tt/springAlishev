package ru.alishev.springAlishev;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.text.GapContent;

@Component
public class Computer {
    private int id;
    private MusicPlayer musicPlayer;

    @Autowired
    public Computer(MusicPlayer musicPlayer) {
        this.id = 1;
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        return "Computer " + id + "\n" + musicPlayer.playMusic(MusicGenre.ROCK) + musicPlayer.playMusic(MusicGenre.CLASSICAL);
    }
}
