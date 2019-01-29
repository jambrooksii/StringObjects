package com.company;



public class Car {
   private String make;
    private String model;

    public Car(String make, String model){
        this.model = model;
        this.make = make;
    }

    public void printCarDetails(){
        System.out.println("Your Cars make is " + make + "and Car Model is " + model);
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


}
