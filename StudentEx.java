package com.telran.project.mth;

public class StudentEx implements Runnable {
    private String name;

    public StudentEx(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        printNameWithNumber();
    }

    private void printNameWithNumber() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(name + " " + i);

        }
    }
}
