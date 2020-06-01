package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the number of threads");
        MyThread threads = new MyThread(new Scanner(System.in).nextInt());
        long time = System.currentTimeMillis();
        double result = new CalculationPiNumber().calculatePi(threads.getThreadPoolSize(),MyThread.getPOINTS());
        System.out.println("NUMBER OF THREADS = " + threads.getThreadPoolSize() + '\n' +
               "NUMBER PI = " +  result + '\n' +
                "TOTAL POINTS ITTERATIONS = "+MyThread.getPOINTS() + '\n' +
                "TIME EXECUTION = " + (System.currentTimeMillis() - time) + " MS "
        );
    }
}
