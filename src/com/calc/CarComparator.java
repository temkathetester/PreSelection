package com.calc;

import java.util.Comparator;

/**
 * Created by Artsiom_Halavach1 on 10/31/2017.
 */
public class CarComparator implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        if (o1.fuel > o2.fuel)
            return 1;
        if(o1.fuel < o2.fuel)
            return -1;
        return 0;
    }
}
