package com.company;

import java.util.Random;

public class MyThread extends Thread {

    private static final int POINTS = 1000000; //How much points we take
    private final int threadPoolSize; //Total threads to calculate pi
    private int rightPoints; //Points which get into circle

    MyThread(int threadPoolSize) {
        this.threadPoolSize = threadPoolSize;
    }

    //x^2 + y^2 = r^2
    //Need all points inside circle
    //x^2 + y^2 <= r^2
    //If correct , incr
    @Override
    public void run() {
        for (int i = 0; i < POINTS / threadPoolSize; i++) {
            if (Math.pow(new Random().nextDouble() * 1, 2) + Math.pow(new Random().nextDouble() * 1, 2) <= Math.pow(1, 2)) {
                rightPoints++;
            }
        }
    }

    int getThreadPoolSize() {
        return threadPoolSize;
    }

    int getRightPoints() {
        return rightPoints;
    }

    static int getPOINTS() {
        return POINTS;
    }
}


