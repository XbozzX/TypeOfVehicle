package com.learnProgramming;

public class TypeOfCar extends Car{

    // init the field
    private String TypeOfFuel;
    private String BrandName;
    private String ModelNumber;


    // declare constructor for set up the user value
    public TypeOfCar(boolean HandOnSteering, String ChangingGear, int Speed, String typeOfFuel, String brandName, String modelNumber){
        super(HandOnSteering, ChangingGear, Speed);
        this.TypeOfFuel = typeOfFuel;
        this.BrandName = brandName;
        this.ModelNumber = modelNumber;
    }

    //init the getter
    public String getTypeOfFuel() {
        return TypeOfFuel;
    }

    public String getBrandName() {
        return BrandName;
    }

    public String getModelNumber() {
        return ModelNumber;
    }

    //declare the method that indicate the type of car
    public void CurrentBrandName(){
        System.out.println("Brand Name :" + this.BrandName);
    }

    public void CurrentModelNumber(){
        System.out.println("Model Number :" + this.ModelNumber);
    }

    public void CurrentTypeOfFuel(){
        System.out.println("Type of Fuel :" + this.TypeOfFuel);
    }
}
