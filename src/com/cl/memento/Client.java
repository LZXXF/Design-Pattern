package com.cl.memento;

public class Client {

    public static void main(String[] args) {
        CareTaker careTaker = new CareTaker();

        Emp emp = new Emp("Can Li", 18, 900);
        System.out.println("First time to print object: " + emp.getEname() + "--" + emp.getAge() + "---" + emp.getSalary());

        careTaker.setMemento(emp.memento());//memento one time

        emp.setAge(29);
        emp.setEname("hello");
        emp.setSalary(100000);

        System.out.println("Second time to print object: " + emp.getEname() + "--" + emp.getAge() + "---" + emp.getSalary());

        emp.recovery(careTaker.getMemento());

        System.out.println("Third time to print object: " + emp.getEname() + "--" + emp.getAge() + "---" + emp.getSalary());

    }



}
