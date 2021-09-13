package org.example;
import java.util.Scanner;

/**
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Anh Pham
 *
 */
public class App 
{
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean quit = false;
        while(!quit) {
            System.out.println("What is your name?");
            String name = scanner.nextLine().toLowerCase();
            if(name.equals("end")) {
                System.out.println("Good-Bye!");
                quit = true;
            }
            else {
                System.out.println("Hello " + name.substring(0,1).toUpperCase() + name.substring(1, name.length()).toLowerCase() + ", nice to meet you!\n");
            }
        }
    }
}
