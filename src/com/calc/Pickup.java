package com.calc;

/**
 * Created by Artsiom_Halavach1 on 10/31/2017.
 */
public class Pickup extends Car {

        private int carrying ;
        public Pickup (){
            super();
            carrying = 0;
        }
        public Pickup (String id, double fuel, int cost, int maxSpeed, int carrying){
            super(id, fuel, cost, maxSpeed);
            this.carrying = carrying;

        }

        public  int getCarrying(){
            return  carrying;
        }

        @Override
        public void drive() {
            System.out.print("Pickup prprprpr");
        }
    }


