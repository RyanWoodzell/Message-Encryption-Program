package Src;

import java.util.Scanner;

public class Interface {
    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write a message you would like translated to pig-latin: ");
        String message = sc.nextLine();
    }
}
