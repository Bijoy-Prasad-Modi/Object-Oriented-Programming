package com.Bijoy.interfaces;

public class PerfectCar {
    private Engine engine;
    private Media player = new CDPlayer();

    public PerfectCar(){
        engine=new PowerEngine();
    }

    public PerfectCar(Engine engine){
        this.engine= engine ;
    }

    public void start(){
        engine.start();
    }

    public void stop(){
        engine.stop();
    }

    public void startMusic(){
        player.start();
    }

    public void stopMusic(){
        player.stop();
    }

    public void upgradeEngine(){
        this.engine=new ElectricEngine();
    }
}
