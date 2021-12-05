package ru.alishev.springAlishev;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Music musicClassical = context.getBean("classicalMusicBean",Music.class);
        Music musicRock = context.getBean("rockMusicBean",Music.class);
        MusicPlayer musicClassicalPlayer = new MusicPlayer(musicClassical);
        MusicPlayer musicRckPlayer = new MusicPlayer(musicRock);
        musicClassicalPlayer.playMusic();
        musicRckPlayer.playMusic();
        context.close();
    }
}
