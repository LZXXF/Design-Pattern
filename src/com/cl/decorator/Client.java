package com.cl.decorator;

import javax.swing.*;

public class Client {
    public static void main(String[] args) {
        ICar car = new Car();
        car.move();

        System.out.println("add new function: fly-----");

        FlyCar flyCar = new FlyCar(car);
        flyCar.move();

        System.out.println("add new function: swim----");

        ICar waterCar = new WaterCar(flyCar);
        waterCar.move();

        System.out.println("add two new functions");
        ICar waterFlyCar = new WaterCar(new FlyCar(car));
        waterFlyCar.move();

    }
}
