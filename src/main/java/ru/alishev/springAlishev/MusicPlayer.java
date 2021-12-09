package ru.alishev.springAlishev;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class  MusicPlayer {

    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;


    private List<Music> genreMusic;


    @Autowired
//    @Qualifier("rockMusic") //Если существует два бина подходящих, можно использовать уточнение
//    public void setMusic(Music classicalMusic, Music rockMusic) { //можно еще так присвоить бины...
    public void setMusic(List<Music> listMusic) {
        this.genreMusic = listMusic;
//      this.music1 = classicalMusic;
//      this.music2 = rockMusic; //и вот так их вызвать
    }

//    public MusicPlayer(Music music) {
//        this.music = music;
//    }
//
//    @Autowired
//    public void setMusic(Music music) {
//        this.music = music;
//    }

    public String playMusic(MusicGenre genre) {
        Random random = new Random();
        int rand = random.nextInt(3);

        if(genre == MusicGenre.CLASSICAL){
            return "Playing " + genreMusic.get(rand).getSong().get(rand)+"\n";
        }
        else {
            return "Playing " + genreMusic.get(rand).getSong().get(rand)+"\n";
        }
    }

    public int getVolume() {
        return volume;
    }

    public String getName() {
        return name;
    }
}
