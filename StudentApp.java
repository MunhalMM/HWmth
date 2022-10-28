package com.telran.project.mth;

public class StudentApp {
    public static void main(String[] args) {
        
        StudentEx lukas = new StudentEx("Lukas");
        Thread threadOne = new Thread(lukas);
        threadOne.start();

        StudentEx mariya = new StudentEx("Mariya");
        Thread threadTwo = new Thread(mariya);
        threadTwo.start();

        StudentEx anton = new StudentEx("Anton");
        Thread threadThree = new Thread(anton);
        threadThree.start();

        StudentEx anna = new StudentEx("Anna");
        Thread threadFour = new Thread(anna);
        threadFour.start();

    }
}
