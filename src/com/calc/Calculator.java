package com.calc;
import com.calc.Arrays;


import java.util.Scanner;

/**
 * Created by Artsiom_Halavach1 on 10/31/2017.
 */
public class Calculator {

    public static void Calculator(){
    System.out.println("Enter first number");
    Scanner scanner = new Scanner(System.in);
    double firstNumber = scanner.nextInt();

        System.out.println("Enter second number");
    double secondNumber = scanner.nextInt();

        System.out.println("Enter operator");
    char operator = scanner.next().charAt(0);


    double res;
    res=0;
    String result ;
        switch (operator) {
        case '+':
            res = firstNumber + secondNumber;

            break;
        case '*':
            res = firstNumber * secondNumber;

            break;
        case '-':
            res = firstNumber - secondNumber;

            break;
        case '/':
            if (secondNumber==0) {
                System.out.print("division by 0");
                break;
            }

            res = firstNumber / secondNumber;

            break;

    }
        System.out.print(res);
    Arrays firstArray = new Arrays();
        firstArray.OutputInitial();
        System.out.println(); System.out.println();


        firstArray.ArraySort();
        firstArray.OutputInitial();

        System.out.println();
}

}
