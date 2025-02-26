package main;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Middle {
    static Scanner s = new Scanner(System.in);


    public static void next_er(){
        System.out.println("Please enter anything:");
            // TODO: get next thing from Scanner s
            System.out.println("You gave me:");
            // TODO: print what is gotten
    }
    public static void nextInt_er(){
        System.out.println("Please enter an INTEGER:");
            // TODO: get next integer from Scanner s
            System.out.println("You gave me:");
            // TODO: print what is gotten
        }
    public static void nextLine_r(){
        System.out.println("Please enter anything:"); s.nextLine();
            // TODO: get next line from Scanner s
            System.out.println("You gave me:");
            // TODO: print what is gotten
    }

    public static void nextBoolean_er(){
        System.out.println("Please enter a BOOLEAN:");
            // TODO: get next boolean from Scanner s
            System.out.println("You gave me:");
            // TODO: print what is gotten
        }
    public static void main(String[] args) {
        next_er();
        nextInt_er();
        nextLine_r();
        nextBoolean_er();
        
        

        s.close();
    }
}
