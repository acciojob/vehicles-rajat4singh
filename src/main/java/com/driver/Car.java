package com.driver;

public class Car extends Vehicle {
    private int wheels;
    private String type;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;
    private int seats;
    
    public Car(String name){
        super(name);
       // this.isManual = isManual;
       changeGear(1);
    }

    public Car(String name, int wheels, int doors, int gears, boolean isManual, String type, int seats) {
        //Hint: Car extends Vehicle
        super(name);
        this.wheels = wheels;
        this.type = type;
       // this.currentGear = 1; //check again
        this.seats = seats;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        changeGear(1);
    }
    
    public String getType(){
        return this.type;
    }
    public int getDoors(){
        return this.doors;
    }
    public int getWheels(){
        return this.wheels;
    }
    public int getGears(){
        return this.gears;
    }
    public int getCurrentGear(){
        return this.currentGear;
    }
    public int getSeats(){
        return this.seats;
    }
    public boolean isManual(){
        return this.isManual;
    }
    

    public void changeGear(int newGear){
        this.currentGear = newGear;

        System.out.println("changeGear method called - The gear is changed to: " + currentGear);
    }

    public void changeSpeed(int newSpeed, int newDirection){
        move(newSpeed, newDirection);
        System.out.println("changeSpeed method called - The speed is changed to: " + newSpeed + ", and the direction is changed to: " + newDirection + " degrees");
    }
}
