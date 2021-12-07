package ru.alishev.springAlishev;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

//        ClassicalMusic classicalMusic = context.getBean("classicMusicBean",ClassicalMusic.class);
//        System.out.println(classicalMusic.getSong());

        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer",MusicPlayer.class);

        boolean comparasion = secondMusicPlayer==firstMusicPlayer;//разные ссылки!

        firstMusicPlayer.setVolume(10);

//        System.out.println(firstMusicPlayer);//разные hashCode из-за scope="property"
//        System.out.println(secondMusicPlayer);

        System.out.println(firstMusicPlayer.getVolume());//т.к указан scope="property" значение изменилос только у first
        System.out.println(secondMusicPlayer.getVolume());

//        musicPlayer.playMusic();
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());

        context.close();
    }

}
