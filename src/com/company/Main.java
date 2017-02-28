package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello! Welcome to Crystal Color Converter!!");
        System.out.println("Enter 1 if you'd like to enter a Hexadecimal");
        System.out.println("Enter 2 if you'd like to enter a HTML name");
        System.out.println("Enter 3 if you'd like to enter an RGB Triplet");
        String begin = input.next();

        if (begin.equalsIgnoreCase("1")) {
            Storage j = new Storage();

            System.out.println("Enter a Hexidecimal number");

            String response = input.next();

            j.Converter(response);

        } else if (begin.equalsIgnoreCase("2")) {

            Storage j = new Storage();

            System.out.println("Enter any common HTML name");

            String response = input.next();

            j.Converter(response);

        } else if (begin.equalsIgnoreCase("3")) {
            Storage j = new Storage();

            System.out.println("Enter an RGB triplet");

            String response = input.next();

            j.Converter(response);

        }
        else
            System.out.println("Error has been found");

    }
    }
