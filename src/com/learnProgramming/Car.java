package com.learnProgramming;

public class Car extends Vehicle{

    public Car(boolean HandOnSteering, String ChangingGear, int Speed) {
        super(HandOnSteering, ChangingGear, Speed);

    }

    // override the method that indicate the vehicle behaviour
    // adding if statement to notify the user
    @Override
    public void CurrentSpeed(){
        int speed = super.getSpeed();

        if (speed >= 140){
            System.out.println("Speed :" + speed);
            System.out.println("Danger!!,,,slow down");
        } else if (speed < 140 || speed >= 1){
            System.out.println("Speed :" + speed);
            System.out.println("Normal speed");
        }
    }
}
