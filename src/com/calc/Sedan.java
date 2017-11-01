package com.calc;

/**
 * Created by Artsiom_Halavach1 on 10/31/2017.
 */
public class Sedan extends Car {
    private int passengerCount ;
    public Sedan (){
        super();
        passengerCount = 0;
    }
    public Sedan (String id, double fuel, int cost, int maxSpeed, int passengerCount){
        super(id, fuel, cost, maxSpeed);
        this.passengerCount = passengerCount;

    }

    public int getPassengerCount()
    {
        return passengerCount;
    }

    @Override
    public void drive() {
        System.out.print("Sedan prprprpr");
    }
}
