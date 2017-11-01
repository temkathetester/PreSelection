package com.calc;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        System.out.println("Please enter task: 1 - Calculator, 2 - Array Sorting or 3 - Taxopark");
        Scanner userinput = new Scanner(System.in);
        int r =  userinput.nextInt();

        switch (r) {
            case 1: Calculator.Calculator();
            break;
            case 2: Arrays array = new Arrays();
            array.OutputInitial();
            array.ArraySort();
            array.OutputInitial();
            break;
            case 3:
                Car firstCar = new Sedan("1", 7.5, 7000,250, 4);
                Car secondCar = new Sedan("2", 6.5, 8000,270, 3);
                Car thirdCar = new Pickup("3", 8.5, 9000,250, 600);
                Car fourthCar = new Pickup("4", 10.5, 8300,250, 800);

                Taxopark taxopark = new Taxopark();
                taxopark.addCar(firstCar);
                taxopark.addCar(secondCar);
                taxopark.addCar(thirdCar);
                taxopark.addCar(fourthCar);

                taxopark.print();

                System.out.println("magic of the sorting coming");
                taxopark.sortByFuel();
                taxopark.print();

                System.out.println("Total cost: ");
                System.out.println(taxopark.getParkTotalCost());

                System.out.println("please input min and max car cost");
                System.out.println("Enter min cost");
                Scanner scanner = new Scanner(System.in);
                int minCost = scanner.nextInt();

                System.out.println("Enter max cost");
                int maxCost = scanner.nextInt();

                ArrayList<Car> result = taxopark.carSelectorByCost(minCost, maxCost);
                for (Car car: result
                     ) { System.out.println("Id: " + car.getId() + " Cost: " + car.getCost() + " Max Speed: " + car.getMaxSpeed() + " Fuel: " + car.getFuel());

                }





        }

    }
}
