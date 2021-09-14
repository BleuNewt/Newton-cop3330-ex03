/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Ryan Newton
 */
import java.util.Scanner;
public class Exercise3 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("What is the quote?");
        String quote = scan.next();
        System.out.println("Who said it?");
        String who = scan.next();

        System.out.print(who);
        System.out.print(" ");
        System.out.print("says,");
        System.out.print(" ");
        System.out.print(quote);
    }
}