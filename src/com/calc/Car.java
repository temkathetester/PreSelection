package com.calc;

import java.util.Comparator;
import java.util.Random;

/**
 * Created by Artsiom_Halavach1 on 10/31/2017.
 */
public class Car implements MovementTool{

        protected String id;
        protected  double fuel;
        protected int cost;
        protected int maxSpeed;

       public Car () {
           id="";
           fuel = 0;
           cost = 0;
           maxSpeed = 0;
       }

       public Car (String id, double fuel, int cost, int maxSpeed)  {
           this.id = id;
           this.fuel = fuel;
           this.cost = cost;
           this.maxSpeed = maxSpeed;
       }


    @Override
    public void drive() {
        System.out.print("Car prprprpr");
    }

    public int getCost()
    {
        return this.cost;
    }

    public double getFuel()
    {
        return this.fuel;
    }

    public int getMaxSpeed()
    {
        return this.maxSpeed;
    }

    public String getId()
    {
        return this.id;
    }

}



