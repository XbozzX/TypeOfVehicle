package com.learnProgramming;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //init the value for the field
        Vehicle car1 = new Vehicle(true, "3",150);
        Car car2 = new Car(true, "3", 150);
        TypeOfCar car3 = new TypeOfCar(true, "3", 150, "97 Petrol", "Nissan GTR", "M01315642");

        System.out.println("Type of car");
        car3.CurrentBrandName();
        car3.CurrentModelNumber();
        car3.CurrentTypeOfFuel();
        System.out.println("\n");

        System.out.println("Behaviours of the car");
        car2.CurrentHandOnSteering();
        car2.CurrentGear();
        car2.getSpeed();
        System.out.println("get speed" + car1.getSpeed());
        car2.CurrentSpeed();

    }
}
