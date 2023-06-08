/*----------------------------------------------------------------------------------------
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 *---------------------------------------------------------------------------------------*/

package com.mycompany.app;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello Remote World!");
      
    }

    public void loop(){
         //create loop from 1 to 100 of integer
        for (int i = 1; i <= 100; i++) {
            //if the number is divisible by 3 and 5, print FizzBuzz
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            //if the number is divisible by 3, print Fizz
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            //if the number is divisible by 5, print Buzz
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            //if the number is not divisible by 3 or 5, print the number
            } else {
                System.out.println(i);
            }
        }
    }
}
