package ru.alishev.springAlishev;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
//Тогда можно удалить xml файл
@Configuration
@ComponentScan("ru.alishev.springAlishev")
@PropertySource("classpath:musicValue.properties")
public class SpringConfig {
    //Все это если создавать Bean вручную, а не аннотацией component
//    @Bean
//    public ClassicalMusic classicalMusic(){
//        return new ClassicalMusic();
//    }
//
//    @Bean
//    public RockMusic rockMusic(){
//        return new RockMusic();
//    }
//
//    @Bean
//    public MusicPlayer musicPlayer(){
//        return new MusicPlayer(rockMusic(),classicalMusic());
//    }
//
//    @Bean
//    public Computer computer(){
//        return new Computer(musicPlayer());
//    }

    @Bean
    public GenreMusicList genreMusicList(){
        return new GenreMusicList();
    }



}
