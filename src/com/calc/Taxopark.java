package com.calc;
import com.calc.MovementTool;
import com.calc.Car;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by Artsiom_Halavach1 on 10/31/2017.
 */
public final class Taxopark {

private ArrayList<Car> park;

public  Taxopark (){
    park = new ArrayList<Car>();
}
public void addCar (Car car){
    park.add(car);

    }

    public int getParkTotalCost(){

    int totalCost = 0;
        for (Car car: park) {
            totalCost += car.getCost();
        }
        return totalCost;
        }

    public void sortByFuel() {
        Collections.sort(park, new CarComparator());
    }

    public ArrayList<Car> carSelectorByCost (int minCost, int maxCost)
    {
        ArrayList<Car> searchResult = new ArrayList<>();
        for (Car car: park) {
            if (car.getCost() >= minCost && car.getCost() <= maxCost)
            {
                searchResult.add(car);
            }
        }
        return searchResult;

    }

    public void print ()
    {
        for (Car car: park) {
            System.out.println("Id: " + car.getId() + " Cost: " + car.getCost() + " Max Speed: " + car.getMaxSpeed() + " Fuel: " + car.getFuel());
        }
    }

}


