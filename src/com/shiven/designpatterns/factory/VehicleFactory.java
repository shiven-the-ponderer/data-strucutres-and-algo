package com.shiven.designpatterns.factory;

public final class VehicleFactory {
    
    public static Vehicle getInstance(String string) {
        Vehicle vehicle = null;
        if(string=="car") {
            vehicle = new Car();
        }
        else if(string=="bus") {
            vehicle = new Bus();
        }
        return vehicle;
    }
    
    public static void main(String[] args) {
        Vehicle vehicle = VehicleFactory.getInstance("car");
        
    }

}
