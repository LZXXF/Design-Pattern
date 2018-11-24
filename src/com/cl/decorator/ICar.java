package com.cl.decorator;


/**
 * Abstract component
 * @author Can Li
 */

public interface ICar {
    void move();
}

//Concrete Component
class Car implements ICar {

    @Override
    public void move() {
        System.out.println("run on the land road");
    }
}


class SuperCar implements ICar {

    protected ICar car;

    public SuperCar(ICar car) {
        super();
        this.car = car;
    }

    @Override
    public void move() {
        car.move();
    }
}

//Concrete decorator
class WaterCar extends SuperCar {

    public WaterCar(ICar car) {
        super(car);
    }

    public void swim() {
        System.out.println("Swim");
    }

    @Override
    public void move() {
        super.move();
        swim();
    }
}

//Concrete decorator
class FlyCar extends SuperCar {

    public FlyCar(ICar car) {
        super(car);
    }

    public void fly() {
        System.out.println("fly");
    }

    @Override
    public void move() {
        super.move();
        fly();
    }
}

