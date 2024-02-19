package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("З якою швидкістю рухається авто?");
        var speed = scanner.nextDouble();

        while (true) {
            System.out.println("Скільки годин?");
            var time = scanner.nextDouble();

            if (time == 0)
                break;

            var result = speed * time;
            System.out.println("За вказаними параметрами авто проїде " + result + "км");
        }
    }
}