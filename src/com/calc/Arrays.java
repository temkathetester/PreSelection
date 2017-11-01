package com.calc;

import java.util.ArrayList;
import java.util.Random;

import static jdk.nashorn.internal.objects.Global.print;
import static jdk.nashorn.internal.objects.Global.println;

/**
 * Created by Artsiom_Halavach1 on 10/31/2017.
 */
public class Arrays {

String[] initialArray = new String[15];

    public Arrays () {
            String tempString;
            Random random = new Random();
        for (int i = 0; i < 15; ++i)
        {
            tempString="";
            int lenght = random.nextInt(15);
            for (int j =0; j<lenght;j++) {
                tempString= tempString+"a";
            }
            initialArray[i] = tempString;

        }



    }
public void OutputInitial () {
        for (int i=0; i<15; i++){
            System.out.println(initialArray[i]);
        }
}

public void ArraySort () {
    for (int i = 0; i < 15; i++) {
        for (int j = 1; j < 15; j++)
            if (initialArray[i].length() < initialArray[j].length()) {

                //Swap(initialArray[i], initialArray[j]);
                String temp = initialArray[i];
                initialArray[i] = initialArray[j];
                initialArray[j] = temp;


        }
    }

}


}
