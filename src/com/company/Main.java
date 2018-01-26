package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //while loops

        boolean whileCondion = true;
        int count = 0;

        while(whileCondion){
            System.out.println("Our while condition is true. Add 1 to our count.");
            count += 1;
            if (count == 3){
                System.out.println("Our count is at 3");
                whileCondion = false;
            }
        }

        //do while loop

        do {
            System.out.println("Our while condition is true. Add 1 to our count.");
            count += 1;
            if (count == 3) {
                System.out.println("Our count is at 3");
                whileCondion = false;
            }
        } while(whileCondion);

        //for loop

        for (int i = 0; i <= 5; i++){
            System.out.println(i);
        }

        //foreach
        
        ArrayList<String> fruit = new ArrayList<>();
        fruit.add("Apple");
        fruit.add("Banana");
        fruit.add("Orange");
        fruit.add("Strawberry");
        fruit.add("Grape");

        for (String food : fruit){
            if (food.contains("b") || food.contains("B")){
                System.out.println(food);
            }
        }
    }
}
