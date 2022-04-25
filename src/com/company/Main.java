package com.company;

public class Main {

    public static void main(String[] args) {
        int time=10;
        double acceleration=-9.81;
        int velocity=0;
        int iniposition=0;
        double position=0.5 * Math.pow(time,2)*acceleration+velocity+iniposition;
        System.out.println(position);
    }

}
