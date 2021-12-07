package ru.alishev.springAlishev;

public class PopMusic implements Music {
    public void doMyInit(){
        System.out.println("Do my initialization pop");
    }

    public void doMyDestroy(){
        System.out.println("Do my destruction pop");
    }
    @Override
    public String getSong(){
        return "pop music";
    }
}

