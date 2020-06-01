package com.company;

import java.util.ArrayList;
import java.util.List;

public class CalculationPiNumber {
    double calculatePi(int poolSize, int allPoints) {
        List<MyThread> listOfThread = new ArrayList<>();
        for (int itter = 0; itter < poolSize; itter++) {
            MyThread calculationThread = new MyThread(poolSize);
            calculationThread.start();
            listOfThread.add(calculationThread);
        }
        int getInCirclePoints = 0;
        for (MyThread thread : listOfThread) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            getInCirclePoints += thread.getRightPoints();
        }
        return (double) 4 * getInCirclePoints / allPoints;
    }
}
