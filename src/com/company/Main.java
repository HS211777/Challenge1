package com.company;
import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Random random = new Random();
    Scanner input = new Scanner(System.in);
    int number = random.nextInt(100);
    number++;
    boolean end = false;
    while (end == false){
        System.out.println("Enter a number from 1 to 100");
        int userInput = 0;
        try{
            userInput = input.nextInt();
        } catch (Exception e){
            System.out.println("Error");
        }
        if (userInput == number){
            System.out.println("Correct");
            end = true;
        }
        else if (userInput > number){
            if (userInput - number <= 10){
                System.out.println("hot");
            }
            else if (userInput - number <= 25){
                System.out.println("warm");
            }
            else{
                System.out.println("cold");
            }
        }
        else{
            if (number - userInput <= 10){
                System.out.println("hot");
            }
            else if (number - userInput <= 25){
                System.out.println("warm");
            }
            else{
                System.out.println("cold");
            }
        }
    }
    }
}
