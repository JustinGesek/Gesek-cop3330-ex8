package ex8;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 justin gesek
 */
import java.util.Scanner;
//How many people? 8
//How many pizzas do you have? 2
//How many slices per pizza? 8
//8 people with 2 pizzas (16 slices)
//Each person gets 2 pieces of pizza.
//There are 0 leftover pieces.
public class ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many people? ");
        int people = scanner.nextInt();

        System.out.print("How many pizzas do you have? ");
        int pizzas = scanner.nextInt();

        System.out.print("How many slices per pizza? ");
        int slices = scanner.nextInt();

        int totalSlices  = pizzas * slices;
        System.out.printf("%d people with %d pizzas (%d slices)\n", people, pizzas, totalSlices);
        int slices_per_person = totalSlices / people;
        int slicesLeftover = totalSlices % people;
        System.out.printf("Each person gets %d pieces of pizza.\n", slices_per_person);
        System.out.printf("There are %d leftover pieces.\n", slicesLeftover);
    }
}
