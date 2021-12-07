package ru.alishev.springAlishev;

public class ClassicalMusic implements Music {

    private ClassicalMusic(){}

    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }

    public void doMyInit(){
        System.out.println("Do my initialization classic");
    }

    public void doMyDestroy(){
        System.out.println("Do my destruction classic");
    }
    @Override
    public String getSong(){
        return "classical music";
    }
}
