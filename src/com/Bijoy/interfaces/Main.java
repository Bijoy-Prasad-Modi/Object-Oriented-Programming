package com.Bijoy.interfaces;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car();
//        car.acc();
//        car.start();
//        car.stop();
//        car.brake();


        PerfectCar car = new PerfectCar();
        car.start();
        car.startMusic();
        car.upgradeEngine();
        car.start();
    }
}
