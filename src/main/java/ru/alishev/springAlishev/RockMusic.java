package ru.alishev.springAlishev;

public class RockMusic implements Music {
    public void doMyInit(){
        System.out.println("Do my initialization rock");
    }

    public void doMyDestroy(){
        System.out.println("Do my destruction rock");
    }
    @Override
    public String getSong(){
        return "rock music  ";
    }
}
