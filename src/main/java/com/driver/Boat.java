/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.driver;

/**
 *
 * @author rssun
 */
public class Boat implements WaterVehicle {
    
    private String name;
    private int capacity;
    
    public Boat(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
    }
   
    public String getVehicleName(){
        return this.name;
    }
    public int getVehicleCapacity(){
        return this.capacity;
    }

    public String getName(){
        return name;
    }
    
    public int getCapacity(){
        return capacity;
    }
}