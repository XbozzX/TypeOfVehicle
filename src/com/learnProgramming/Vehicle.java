package com.learnProgramming;

public class Vehicle {

    //Init the field
    private boolean HandOnSteering;
    private String ChangingGear;
    private int Speed;


    //init the constructor for set up the user value
    public Vehicle(boolean HandOnSteering, String ChangingGear, int Speed){
        this.HandOnSteering = HandOnSteering;
        this.ChangingGear = ChangingGear;
        this.Speed = Speed;
    }

    //create the getter
    public boolean isHandOnSteering() {
        return HandOnSteering;
    }

    public String getChangingGear() {
        return ChangingGear;
    }


    //create the behaviour of the vehicle
    public int getSpeed() {
        return Speed;
    }

    public void CurrentHandOnSteering(){
        System.out.println("Hand On Steering :" + this.HandOnSteering);
    }

    public void CurrentSpeed(){
        System.out.println(this.Speed + " km/h");
    }

    public void CurrentGear(){
        System.out.println( "Gear: " + this.ChangingGear );
    }
}
