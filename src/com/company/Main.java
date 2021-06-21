/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Jeremy Bouhadana
 */
package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner jb = new Scanner(System.in);
        int sonk = 0;
        int i = 0;
        int numbers = 0;
        String input = ("Ling, Mai\n" +
                "Johnson, Jim\n" +
                "Zarnecki, Sabrina\n" +
                "Jones, Chris\n" +
                "Jones, Aaron\n" +
                "Swift, Geoffrey\n" +
                "Xiong, Fong");
        while (sonk != 0) {
            while (input.charAt(i) != '\n') {
                i++;
                sonk = 1;
            }
            numbers++;
        }
        String[] sonkString = new String[numbers];
        System.out.println("Enter " + i);
    }
}
